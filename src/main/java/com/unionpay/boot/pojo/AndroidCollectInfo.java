package com.unionpay.boot.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AndroidCollectInfo {
    private Integer id;

    private String deviceId;

    private String imei;

    private String imsi;

    private String wifimacaddress;

    private String serialnumber;

    private String udid;

    @JsonProperty("root")
    private Boolean root;

    private Boolean touchscreen;

    private String screensize;

    private String screenresolution;

    private String deviceversion;

    private String devicename;

    private String ostype;

    private String osversion;

    private String oslanguage;

    private String appnumber;

    private String appvversion;

    private String appchannel;

    private String sdkversion;

    private String usedstorage;

    private String availablestorage;

    private String batterylevel;

    private String basebandversion;

    private String country;

    private String timezone;

    private String ip;

    private String mobilesupplier;

    private String mcc;

    private String mnc;

    private String bbsjd;

    private String ssid;

    private Boolean simulator;

    private String pksignatureld;

    private String pksignatureldhash;

    private Date collecttime;

    private String dfpsdkversion;

    private String gpslnfo;

    private String telno;

    private String netwktype;

    private String dnsaddress;

    private String kernelversion;

    private String cpumode;

    private String terminaltype;

    private String clientip;

    public AndroidCollectInfo(Integer id, String deviceId, String imei, String imsi, String wifimacaddress, String serialnumber, String udid, Boolean root, Boolean touchscreen, String screensize, String screenresolution, String deviceversion, String devicename, String ostype, String osversion, String oslanguage, String appnumber, String appvversion, String appchannel, String sdkversion, String usedstorage, String availablestorage, String batterylevel, String basebandversion, String country, String timezone, String ip, String mobilesupplier, String mcc, String mnc, String bbsjd, String ssid, Boolean simulator, String pksignatureld, String pksignatureldhash, Date collecttime, String dfpsdkversion, String gpslnfo, String telno, String netwktype, String dnsaddress, String kernelversion, String cpumode, String terminaltype, String clientip) {
        this.id = id;
        this.deviceId = deviceId;
        this.imei = imei;
        this.imsi = imsi;
        this.wifimacaddress = wifimacaddress;
        this.serialnumber = serialnumber;
        this.udid = udid;
        this.root = root;
        this.touchscreen = touchscreen;
        this.screensize = screensize;
        this.screenresolution = screenresolution;
        this.deviceversion = deviceversion;
        this.devicename = devicename;
        this.ostype = ostype;
        this.osversion = osversion;
        this.oslanguage = oslanguage;
        this.appnumber = appnumber;
        this.appvversion = appvversion;
        this.appchannel = appchannel;
        this.sdkversion = sdkversion;
        this.usedstorage = usedstorage;
        this.availablestorage = availablestorage;
        this.batterylevel = batterylevel;
        this.basebandversion = basebandversion;
        this.country = country;
        this.timezone = timezone;
        this.ip = ip;
        this.mobilesupplier = mobilesupplier;
        this.mcc = mcc;
        this.mnc = mnc;
        this.bbsjd = bbsjd;
        this.ssid = ssid;
        this.simulator = simulator;
        this.pksignatureld = pksignatureld;
        this.pksignatureldhash = pksignatureldhash;
        this.collecttime = collecttime;
        this.dfpsdkversion = dfpsdkversion;
        this.gpslnfo = gpslnfo;
        this.telno = telno;
        this.netwktype = netwktype;
        this.dnsaddress = dnsaddress;
        this.kernelversion = kernelversion;
        this.cpumode = cpumode;
        this.terminaltype = terminaltype;
        this.clientip = clientip;
    }

    public AndroidCollectInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getWifimacaddress() {
        return wifimacaddress;
    }

    public void setWifimacaddress(String wifimacaddress) {
        this.wifimacaddress = wifimacaddress == null ? null : wifimacaddress.trim();
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid == null ? null : udid.trim();
    }

    public Boolean getRoot() {
        return root;
    }

    public void setRoot(Boolean root) {
        this.root = root;
    }

    public Boolean getTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(Boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize == null ? null : screensize.trim();
    }

    public String getScreenresolution() {
        return screenresolution;
    }

    public void setScreenresolution(String screenresolution) {
        this.screenresolution = screenresolution == null ? null : screenresolution.trim();
    }

    public String getDeviceversion() {
        return deviceversion;
    }

    public void setDeviceversion(String deviceversion) {
        this.deviceversion = deviceversion == null ? null : deviceversion.trim();
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public String getOstype() {
        return ostype;
    }

    public void setOstype(String ostype) {
        this.ostype = ostype == null ? null : ostype.trim();
    }

    public String getOsversion() {
        return osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion == null ? null : osversion.trim();
    }

    public String getOslanguage() {
        return oslanguage;
    }

    public void setOslanguage(String oslanguage) {
        this.oslanguage = oslanguage == null ? null : oslanguage.trim();
    }

    public String getAppnumber() {
        return appnumber;
    }

    public void setAppnumber(String appnumber) {
        this.appnumber = appnumber == null ? null : appnumber.trim();
    }

    public String getAppvversion() {
        return appvversion;
    }

    public void setAppvversion(String appvversion) {
        this.appvversion = appvversion == null ? null : appvversion.trim();
    }

    public String getAppchannel() {
        return appchannel;
    }

    public void setAppchannel(String appchannel) {
        this.appchannel = appchannel == null ? null : appchannel.trim();
    }

    public String getSdkversion() {
        return sdkversion;
    }

    public void setSdkversion(String sdkversion) {
        this.sdkversion = sdkversion == null ? null : sdkversion.trim();
    }

    public String getUsedstorage() {
        return usedstorage;
    }

    public void setUsedstorage(String usedstorage) {
        this.usedstorage = usedstorage == null ? null : usedstorage.trim();
    }

    public String getAvailablestorage() {
        return availablestorage;
    }

    public void setAvailablestorage(String availablestorage) {
        this.availablestorage = availablestorage == null ? null : availablestorage.trim();
    }

    public String getBatterylevel() {
        return batterylevel;
    }

    public void setBatterylevel(String batterylevel) {
        this.batterylevel = batterylevel == null ? null : batterylevel.trim();
    }

    public String getBasebandversion() {
        return basebandversion;
    }

    public void setBasebandversion(String basebandversion) {
        this.basebandversion = basebandversion == null ? null : basebandversion.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone == null ? null : timezone.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getMobilesupplier() {
        return mobilesupplier;
    }

    public void setMobilesupplier(String mobilesupplier) {
        this.mobilesupplier = mobilesupplier == null ? null : mobilesupplier.trim();
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc == null ? null : mcc.trim();
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc == null ? null : mnc.trim();
    }

    public String getBbsjd() {
        return bbsjd;
    }

    public void setBbsjd(String bbsjd) {
        this.bbsjd = bbsjd == null ? null : bbsjd.trim();
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid == null ? null : ssid.trim();
    }

    public Boolean getSimulator() {
        return simulator;
    }

    public void setSimulator(Boolean simulator) {
        this.simulator = simulator;
    }

    public String getPksignatureld() {
        return pksignatureld;
    }

    public void setPksignatureld(String pksignatureld) {
        this.pksignatureld = pksignatureld == null ? null : pksignatureld.trim();
    }

    public String getPksignatureldhash() {
        return pksignatureldhash;
    }

    public void setPksignatureldhash(String pksignatureldhash) {
        this.pksignatureldhash = pksignatureldhash == null ? null : pksignatureldhash.trim();
    }

    public Date getCollecttime() {
        return collecttime;
    }

    public void setCollecttime(Date collecttime) {
        this.collecttime = collecttime;
    }

    public String getDfpsdkversion() {
        return dfpsdkversion;
    }

    public void setDfpsdkversion(String dfpsdkversion) {
        this.dfpsdkversion = dfpsdkversion == null ? null : dfpsdkversion.trim();
    }

    public String getGpslnfo() {
        return gpslnfo;
    }

    public void setGpslnfo(String gpslnfo) {
        this.gpslnfo = gpslnfo == null ? null : gpslnfo.trim();
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno == null ? null : telno.trim();
    }

    public String getNetwktype() {
        return netwktype;
    }

    public void setNetwktype(String netwktype) {
        this.netwktype = netwktype == null ? null : netwktype.trim();
    }

    public String getDnsaddress() {
        return dnsaddress;
    }

    public void setDnsaddress(String dnsaddress) {
        this.dnsaddress = dnsaddress == null ? null : dnsaddress.trim();
    }

    public String getKernelversion() {
        return kernelversion;
    }

    public void setKernelversion(String kernelversion) {
        this.kernelversion = kernelversion == null ? null : kernelversion.trim();
    }

    public String getCpumode() {
        return cpumode;
    }

    public void setCpumode(String cpumode) {
        this.cpumode = cpumode == null ? null : cpumode.trim();
    }

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype == null ? null : terminaltype.trim();
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
    }
}