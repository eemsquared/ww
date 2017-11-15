package com.entities;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Ship {
    private int id;
    private String vessel_name;
    private String voyage_num;
    private String nationality;
    private float GRT;
    private Float LOA;
    private String last_port;
    private String next_port;
    private String berth_pref;
    private String master;
    private Float NRT;
    private Float DWT;
    private Float beam;
    private Timestamp ETA;
    private Timestamp ETD;
    private Float draft_fwd;
    private Float draft_aft;
    private String berth_post;
    private String bollard;
    private String remarks;
    private String filled;

    public Ship() {
    }

    public Ship(String vessel_name, String voyage_num, String nationality, Float GRT, Float LOA, String last_port, String next_port,
                String berth_pref, String master, Float NRT, Float DWT, Float beam, Timestamp ETA, Timestamp ETD,
                Float draft_fwd, Float draft_aft, String berth_post, String bollard, String remarks, String filled) {
        this.vessel_name = vessel_name;
        this.voyage_num = voyage_num;
        this.nationality = nationality;
        this.GRT = GRT;
        this.LOA = LOA;
        this.last_port = last_port;
        this.next_port = next_port;
        this.berth_pref = berth_pref;
        this.master = master;
        this.NRT = NRT;
        this.DWT = DWT;
        this.beam = beam;
        this.ETA = ETA;
        this.ETD = ETD;
        this.draft_fwd = draft_fwd;
        this.draft_aft = draft_aft;
        this.berth_post = berth_post;
        this.bollard = bollard;
        this.remarks = remarks;
        this.filled = filled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVessel_name() {
        return vessel_name;
    }

    public void setVessel_name(String vessel_name) {
        this.vessel_name = vessel_name;
    }

    public String getVoyage_num() {
        return voyage_num;
    }

    public void setVoyage_num(String voyage_num) {
        this.voyage_num = voyage_num;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Float getGRT() {
        return GRT;
    }

    public void setGRT(Float GRT) {
        this.GRT = GRT;
    }

    public Float getLOA() {
        return LOA;
    }

    public void setLOA(Float LOA) {
        this.LOA = LOA;
    }

    public String getLast_port() {
        return last_port;
    }

    public void setLast_port(String last_port) {
        this.last_port = last_port;
    }

    public String getNext_port() {
        return next_port;
    }

    public void setNext_port(String next_port) {
        this.next_port = next_port;
    }

    public String getBerth_pref() {
        return berth_pref;
    }

    public void setBerth_pref(String berth_pref) {
        this.berth_pref = berth_pref;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public Float getNRT() {
        return NRT;
    }

    public void setNRT(Float NRT) {
        this.NRT = NRT;
    }

    public Float getDWT() {
        return DWT;
    }

    public void setDWT(Float DWT) {
        this.DWT = DWT;
    }

    public Float getBeam() {
        return beam;
    }

    public void setBeam(Float beam) {
        this.beam = beam;
    }

    public Timestamp getETA() {
        return ETA;
    }

    public void setETA(Timestamp ETA) {
        this.ETA = ETA;
    }

    public Timestamp getETD() {
        return ETD;
    }

    public void setETD(Timestamp ETD) {
        this.ETD = ETD;
    }

    public Float getDraft_fwd() {
        return draft_fwd;
    }

    public void setDraft_fwd(Float draft_fwd) {
        this.draft_fwd = draft_fwd;
    }

    public Float getDraft_aft() {
        return draft_aft;
    }

    public void setDraft_aft(Float draft_aft) {
        this.draft_aft = draft_aft;
    }

    public String getBerth_post() {
        return berth_post;
    }

    public void setBerth_post(String berth_post) {
        this.berth_post = berth_post;
    }

    public String getBollard() {
        return bollard;
    }

    public void setBollard(String bollard) {
        this.bollard = bollard;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
}
