package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public class a extends f
{
  public String appThumbUrl;
  public boolean feY;
  public String feZ;
  public int ffa;
  public boolean ffb;
  public String ffc;
  public String ffd;
  public String ffe;
  public String fff;
  public String ffg;
  public String ffh;
  public int ffi;
  public int ffj;
  public String ffk;
  public String ffl;
  public boolean ffm;
  public int ffn;
  public int ffo;
  public int ffp = 0;
  public String videoSource;

  public final f Xz()
  {
    AppMethodBeat.i(51119);
    a locala = new a();
    locala.feY = this.feY;
    locala.feZ = this.feZ;
    locala.ffa = this.ffa;
    locala.ffb = this.ffb;
    locala.ffc = this.ffc;
    locala.ffd = this.ffd;
    locala.ffe = this.ffe;
    locala.fff = this.fff;
    locala.ffg = this.ffg;
    locala.ffi = this.ffi;
    locala.ffj = this.ffj;
    locala.ffk = this.ffk;
    locala.ffo = this.ffo;
    locala.ffn = this.ffn;
    locala.videoSource = this.videoSource;
    locala.appThumbUrl = this.appThumbUrl;
    locala.ffp = this.ffp;
    AppMethodBeat.o(51119);
    return locala;
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51120);
    paramStringBuilder.append("<weappinfo>");
    if (!bo.isNullOrNil(paramb.fiO))
      paramStringBuilder.append("<pagepath>" + j.b.mf(paramb.fiO) + "</pagepath>");
    paramStringBuilder.append("<username>" + bo.ani(paramb.fiP) + "</username>");
    paramStringBuilder.append("<appid>" + bo.ani(paramb.fiQ) + "</appid>");
    if (paramb.fja != 0)
      paramStringBuilder.append("<version>" + paramb.fja + "</version>");
    if (paramb.fiR != 0)
      paramStringBuilder.append("<type>" + paramb.fiR + "</type>");
    if (!bo.isNullOrNil(paramb.fjb))
      paramStringBuilder.append("<weappiconurl>" + j.b.mf(paramb.fjb) + "</weappiconurl>");
    if (!bo.isNullOrNil(paramb.fiU))
      paramStringBuilder.append("<shareId>" + j.b.mf(paramb.fiU) + "</shareId>");
    if ((paramb.fiZ == 1) || (paramb.fiZ == 2))
    {
      paramStringBuilder.append("<pkginfo>");
      paramStringBuilder.append("<type>");
      paramStringBuilder.append(paramb.fiZ);
      paramStringBuilder.append("</type>");
      paramStringBuilder.append("<md5>");
      paramStringBuilder.append(paramb.fiS);
      paramStringBuilder.append("</md5>");
      paramStringBuilder.append("</pkginfo>");
    }
    if (!bo.isNullOrNil(paramb.fiV))
      paramStringBuilder.append("<sharekey>" + j.b.mf(paramb.fiV) + "</sharekey>");
    if (!bo.isNullOrNil(this.ffk))
      paramStringBuilder.append("<messageextradata>").append(j.b.mf(this.ffk)).append("</messageextradata>");
    if (this.feY)
    {
      paramStringBuilder.append("<wadynamicpageinfo>");
      paramStringBuilder.append("<shouldUseDynamicPage>1</shouldUseDynamicPage>");
      paramStringBuilder.append("<cacheKey>");
      paramStringBuilder.append(j.b.mf(this.feZ));
      paramStringBuilder.append("</cacheKey>");
      paramStringBuilder.append("</wadynamicpageinfo>");
    }
    if (this.ffb)
    {
      paramStringBuilder.append("<waupdatablemsginfov3>");
      paramStringBuilder.append("<shoulduseupdatablemsg>1</shoulduseupdatablemsg>");
      paramStringBuilder.append("<updatablemsgperiod>");
      paramStringBuilder.append(this.ffi);
      paramStringBuilder.append("</updatablemsgperiod>");
      paramStringBuilder.append("<updatablemsgstate>");
      paramStringBuilder.append(this.ffj);
      paramStringBuilder.append("</updatablemsgstate>");
      paramStringBuilder.append("<updatablemsgcontent>");
      paramStringBuilder.append(j.b.mf(this.ffc));
      paramStringBuilder.append("</updatablemsgcontent>");
      paramStringBuilder.append("<updatablemsgcontentcolor>");
      paramStringBuilder.append(j.b.mf(this.ffd));
      paramStringBuilder.append("</updatablemsgcontentcolor>");
      paramStringBuilder.append("<subscribeentrycontent>");
      paramStringBuilder.append(j.b.mf(this.ffe));
      paramStringBuilder.append("</subscribeentrycontent>");
      paramStringBuilder.append("<subscribeentrybuttonwording>");
      paramStringBuilder.append(j.b.mf(this.fff));
      paramStringBuilder.append("</subscribeentrybuttonwording>");
      paramStringBuilder.append("<subscribeconfirmedcontent>");
      paramStringBuilder.append(j.b.mf(this.ffg));
      paramStringBuilder.append("</subscribeconfirmedcontent>");
      paramStringBuilder.append("<expiredsubscribewording>");
      paramStringBuilder.append(j.b.mf(this.ffh));
      paramStringBuilder.append("</expiredsubscribewording>");
      paramStringBuilder.append("</waupdatablemsginfov3>");
    }
    paramStringBuilder.append("<appservicetype>" + this.ffa + "</appservicetype>");
    if (paramb.fiY != 0)
      paramStringBuilder.append("<disableforward>" + paramb.fiY + "</disableforward>");
    if (paramb.cw(true))
    {
      paramStringBuilder.append("<nativeappinfo>");
      paramStringBuilder.append("<type>" + paramb.fiW + "</type>");
      paramStringBuilder.append("<appnamemultilanguagekey>" + j.b.mf(paramb.fiX) + "</appnamemultilanguagekey>");
      paramStringBuilder.append("</nativeappinfo>");
    }
    paramStringBuilder.append("<videopageinfo>");
    paramb = new StringBuilder("<thumbwidth>");
    if (paramInt1 != 0)
    {
      paramStringBuilder.append(paramInt1 + "</thumbwidth>");
      paramb = new StringBuilder("<thumbheight>");
      if (paramInt2 == 0)
        break label1090;
    }
    while (true)
    {
      paramStringBuilder.append(paramInt2 + "</thumbheight>");
      if (!bo.isNullOrNil(this.videoSource))
        paramStringBuilder.append("<videosource>" + j.b.mf(this.videoSource) + "</videosource>");
      if (!bo.isNullOrNil(this.appThumbUrl))
        paramStringBuilder.append("<appthumburl>" + j.b.mf(this.appThumbUrl) + "</appthumburl>");
      paramStringBuilder.append("<fromopensdk>" + this.ffp + "</fromopensdk>");
      paramStringBuilder.append("</videopageinfo>");
      paramStringBuilder.append("</weappinfo>");
      AppMethodBeat.o(51120);
      return;
      paramInt1 = this.ffn;
      break;
      label1090: paramInt2 = this.ffo;
    }
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(51121);
    if (bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.wadynamicpageinfo.shouldUseDynamicPage"), 0) == 1)
    {
      bool = true;
      this.feY = bool;
      this.feZ = ((String)paramMap.get(".msg.appmsg.weappinfo.wadynamicpageinfo.cacheKey"));
      this.ffa = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.appservicetype"), this.ffa);
      this.ffk = ((String)paramMap.get(".msg.appmsg.weappinfo.messageextradata"));
      if (bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.shoulduseupdatablemsg"), 0) != 1)
        break label358;
    }
    label358: for (boolean bool = true; ; bool = false)
    {
      this.ffb = bool;
      this.ffc = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontent"));
      this.ffd = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontentcolor"));
      this.ffe = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrycontent"));
      this.fff = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrybuttonwording"));
      this.ffg = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeconfirmedcontent"));
      this.ffh = ((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.expiredsubscribewording"));
      this.ffj = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgstate"), 1);
      this.ffi = ((int)bo.getLong((String)paramMap.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgperiod"), 10L));
      this.ffn = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.videopageinfo.thumbwidth"), 0);
      this.ffo = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.videopageinfo.thumbheight"), 0);
      this.videoSource = ((String)paramMap.get(".msg.appmsg.weappinfo.videopageinfo.videosource"));
      this.appThumbUrl = ((String)paramMap.get(".msg.appmsg.weappinfo.videopageinfo.appthumburl"));
      this.ffp = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.videopageinfo.fromopensdk"), 0);
      AppMethodBeat.o(51121);
      return;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.a
 * JD-Core Version:    0.6.2
 */