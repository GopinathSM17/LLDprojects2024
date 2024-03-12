package com.assignment.question;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static  FileBasedConfigurationManager instance;

    private  FileBasedConfigurationManagerImpl(){
        super();
    }

    public static  FileBasedConfigurationManager getInstance(){
        if(instance==null)
                instance=new FileBasedConfigurationManagerImpl();
        return instance;
    }
    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        String val=properties.getProperty(key);
        if(val != null)
            return instance.convert(val,type);
        else
            return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        properties.setProperty(key,value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        properties.remove(key);

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        instance=null;
    }

}