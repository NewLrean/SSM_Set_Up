package com.jzp.po;

import java.math.BigDecimal;
import java.util.Date;

import com.jzp.annotation.Table;



public class Goods {
		private Long id;
	    private String spbm;
	    private Long storeId;
	    private String storeErpid;
	    private String huohao;
	    private String goodSubtitle;
	    private String spmc;
	    private String spgg;
	    private String scqy;
	    private String pzwh;
	    private Date yxq;
	    private String ph;
	    private Integer kc;
	    private BigDecimal inPrice;
	    private BigDecimal salePrice;
	    private String cpztimg;
	    private String cpsltimgs;
	    private String cpxqtimgs;
	    private String onsale;
	    private Integer xl;
	    private Date updateTime;
	    private String state;
	    private String txm;
	    private String ists;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSpbm() {
			return spbm;
		}
		public void setSpbm(String spbm) {
			this.spbm = spbm;
		}
		public Long getStoreId() {
			return storeId;
		}
		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}
		public String getStoreErpid() {
			return storeErpid;
		}
		public void setStoreErpid(String storeErpid) {
			this.storeErpid = storeErpid;
		}
		public String getHuohao() {
			return huohao;
		}
		public void setHuohao(String huohao) {
			this.huohao = huohao;
		}
		public String getGoodSubtitle() {
			return goodSubtitle;
		}
		public void setGoodSubtitle(String goodSubtitle) {
			this.goodSubtitle = goodSubtitle;
		}
		public String getSpmc() {
			return spmc;
		}
		public void setSpmc(String spmc) {
			this.spmc = spmc;
		}
		public String getSpgg() {
			return spgg;
		}
		public void setSpgg(String spgg) {
			this.spgg = spgg;
		}
		public String getScqy() {
			return scqy;
		}
		public void setScqy(String scqy) {
			this.scqy = scqy;
		}
		public String getPzwh() {
			return pzwh;
		}
		public void setPzwh(String pzwh) {
			this.pzwh = pzwh;
		}
		public Date getYxq() {
			return yxq;
		}
		public void setYxq(Date yxq) {
			this.yxq = yxq;
		}
		public String getPh() {
			return ph;
		}
		public void setPh(String ph) {
			this.ph = ph;
		}
		public Integer getKc() {
			return kc;
		}
		public void setKc(Integer kc) {
			this.kc = kc;
		}
		public BigDecimal getInPrice() {
			return inPrice;
		}
		public void setInPrice(BigDecimal inPrice) {
			this.inPrice = inPrice;
		}
		public BigDecimal getSalePrice() {
			return salePrice;
		}
		public void setSalePrice(BigDecimal salePrice) {
			this.salePrice = salePrice;
		}
		public String getCpztimg() {
			return cpztimg;
		}
		public void setCpztimg(String cpztimg) {
			this.cpztimg = cpztimg;
		}
		public String getCpsltimgs() {
			return cpsltimgs;
		}
		public void setCpsltimgs(String cpsltimgs) {
			this.cpsltimgs = cpsltimgs;
		}
		public String getCpxqtimgs() {
			return cpxqtimgs;
		}
		public void setCpxqtimgs(String cpxqtimgs) {
			this.cpxqtimgs = cpxqtimgs;
		}
		public String getOnsale() {
			return onsale;
		}
		public void setOnsale(String onsale) {
			this.onsale = onsale;
		}
		public Integer getXl() {
			return xl;
		}
		public void setXl(Integer xl) {
			this.xl = xl;
		}
		public Date getUpdateTime() {
			return updateTime;
		}
		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getTxm() {
			return txm;
		}
		public void setTxm(String txm) {
			this.txm = txm;
		}
		public String getIsts() {
			return ists;
		}
		public void setIsts(String ists) {
			this.ists = ists;
		}
		@Override
		public String toString() {
			return "Goods [id=" + id + ", spbm=" + spbm + ", storeId=" + storeId + ", storeErpid=" + storeErpid
					+ ", huohao=" + huohao + ", goodSubtitle=" + goodSubtitle + ", spmc=" + spmc + ", spgg=" + spgg
					+ ", scqy=" + scqy + ", pzwh=" + pzwh + ", yxq=" + yxq + ", ph=" + ph + ", kc=" + kc + ", inPrice="
					+ inPrice + ", salePrice=" + salePrice + ", cpztimg=" + cpztimg + ", cpsltimgs=" + cpsltimgs
					+ ", cpxqtimgs=" + cpxqtimgs + ", onsale=" + onsale + ", xl=" + xl + ", updateTime=" + updateTime
					+ ", state=" + state + ", txm=" + txm + ", ists=" + ists + "]";
		}
	    
	    
}
