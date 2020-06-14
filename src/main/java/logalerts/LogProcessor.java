package logalerts;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class LogProcessor {

    BlockingQueue blockingQueue = new LinkedBlockingQueue();
    Map<String, Set<String>> subscriptionMapper  = new ConcurrentHashMap();
    Map<String, LogLevelConfig> logLevelConfigMap = new ConcurrentHashMap<>();

    public void logReader()
    {
        List<String> logList = Arrays.asList(
                                "2019-01-07 14:52:33 Warning data",
                                "2019-01-07 14:52:33 Warning data",
                                "2019-01-07 14:52:34 Critical data",
                                "2019-01-07 14:52:35 Info data");
    }

    public void setUpAllConfig()
    {
        User user1 = new User().setUserName("user1");
        User user2 = new User().setUserName("user2");
        User user3 = new User().setUserName("user3");
        User user4 = new User().setUserName("user4");
        User user5 = new User().setUserName("user5");

        HashSet users = new HashSet<>();

        users.add(user1.getUserName());
        users.add(user2.getUserName());
        users.add(user3.getUserName());
        users.add(user4.getUserName());
        users.add(user5.getUserName());

        subscriptionMapper.put("Critical", users);
        LogLevelConfig logLevelConfig = new LogLevelConfig()
                .setLogDuration(100)
                .setLogFrequency(10)
                .setLogWaitTime(100);

        logLevelConfigMap.put("Critical", logLevelConfig);
    }

}

// read the file line by line
// maintain a count of the loglevel with start time
// if count > frequency then push it to the queue
// read the queue with fixedThread and keep printing.(can be multiple threads too)

