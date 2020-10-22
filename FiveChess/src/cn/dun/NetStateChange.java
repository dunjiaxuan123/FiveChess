package cn.dun;

public interface NetStateChange {
        void onServerOK();

        void onConnect();

        void onMessage(String message);

        void onDisconnect();
}
