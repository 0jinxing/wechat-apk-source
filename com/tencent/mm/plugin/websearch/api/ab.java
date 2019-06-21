package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.f;
import com.tencent.mm.af.j.b;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public class ab extends f
{
  public String lvA;
  public String lvz;
  public String phw;
  public String qVw;
  public String source;
  public String thumbUrl;
  public String uaa;
  public String uab;
  public String uac;
  public String uad;
  public long uae;
  public String uaf;
  public String uag;
  public String uah;
  public String uai;
  public String uaj;
  public String uak;
  public String ual;
  public long uam;
  public String uan;

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(124149);
    paramStringBuilder.append("<websearch>");
    if (!bo.isNullOrNil(this.uaa))
    {
      paramStringBuilder.append("<relevant_vid>");
      paramStringBuilder.append(j.b.mf(this.uaa));
      paramStringBuilder.append("</relevant_vid>");
    }
    if (!bo.isNullOrNil(this.uab))
    {
      paramStringBuilder.append("<relevant_expand>");
      paramStringBuilder.append(j.b.mf(this.uab));
      paramStringBuilder.append("</relevant_expand>");
    }
    if (!bo.isNullOrNil(this.uab))
    {
      paramStringBuilder.append("<relevant_expand>");
      paramStringBuilder.append(j.b.mf(this.uab));
      paramStringBuilder.append("</relevant_expand>");
    }
    if (!bo.isNullOrNil(this.uac))
    {
      paramStringBuilder.append("<relevant_pre_searchid>");
      paramStringBuilder.append(j.b.mf(this.uac));
      paramStringBuilder.append("</relevant_pre_searchid>");
    }
    if (!bo.isNullOrNil(this.uad))
    {
      paramStringBuilder.append("<relevant_shared_openid>");
      paramStringBuilder.append(j.b.mf(this.uad));
      paramStringBuilder.append("</relevant_shared_openid>");
    }
    if (this.uae >= 0L)
    {
      paramStringBuilder.append("<rec_category>");
      paramStringBuilder.append(this.uae);
      paramStringBuilder.append("</rec_category>");
    }
    if (!bo.isNullOrNil(this.lvz))
    {
      paramStringBuilder.append("<shareUrl>");
      paramStringBuilder.append(j.b.mf(this.lvz));
      paramStringBuilder.append("</shareUrl>");
    }
    if (!bo.isNullOrNil(this.lvA))
    {
      paramStringBuilder.append("<shareTitle>");
      paramStringBuilder.append(j.b.mf(this.lvA));
      paramStringBuilder.append("</shareTitle>");
    }
    if (!bo.isNullOrNil(this.qVw))
    {
      paramStringBuilder.append("<shareDesc>");
      paramStringBuilder.append(j.b.mf(this.qVw));
      paramStringBuilder.append("</shareDesc>");
    }
    if (!bo.isNullOrNil(this.uaf))
    {
      paramStringBuilder.append("<shareImgUrl>");
      paramStringBuilder.append(j.b.mf(this.uaf));
      paramStringBuilder.append("</shareImgUrl>");
    }
    if (!bo.isNullOrNil(this.uag))
    {
      paramStringBuilder.append("<shareString>");
      paramStringBuilder.append(j.b.mf(this.uag));
      paramStringBuilder.append("</shareString>");
    }
    if (!bo.isNullOrNil(this.uah))
    {
      paramStringBuilder.append("<shareStringUrl>");
      paramStringBuilder.append(j.b.mf(this.uah));
      paramStringBuilder.append("</shareStringUrl>");
    }
    if (!bo.isNullOrNil(this.source))
    {
      paramStringBuilder.append("<source>");
      paramStringBuilder.append(j.b.mf(this.source));
      paramStringBuilder.append("</source>");
    }
    if (!bo.isNullOrNil(this.phw))
    {
      paramStringBuilder.append("<sourceUrl>");
      paramStringBuilder.append(j.b.mf(this.phw));
      paramStringBuilder.append("</sourceUrl>");
    }
    if (!bo.isNullOrNil(this.uai))
    {
      paramStringBuilder.append("<strPlayCount>");
      paramStringBuilder.append(j.b.mf(this.uai));
      paramStringBuilder.append("</strPlayCount>");
    }
    if (!bo.isNullOrNil(this.uaj))
    {
      paramStringBuilder.append("<titleUrl>");
      paramStringBuilder.append(j.b.mf(this.uaj));
      paramStringBuilder.append("</titleUrl>");
    }
    if (!bo.isNullOrNil(this.uak))
    {
      paramStringBuilder.append("<extReqParams>");
      paramStringBuilder.append(j.b.mf(this.uak));
      paramStringBuilder.append("</extReqParams>");
    }
    if (!bo.isNullOrNil(this.ual))
    {
      paramStringBuilder.append("<tagList>");
      paramStringBuilder.append(j.b.mf(this.ual));
      paramStringBuilder.append("</tagList>");
    }
    if (this.uam >= 0L)
    {
      paramStringBuilder.append("<channelId>");
      paramStringBuilder.append(this.uam);
      paramStringBuilder.append("</channelId>");
    }
    if (!bo.isNullOrNil(this.thumbUrl))
    {
      paramStringBuilder.append("<thumbUrl>");
      paramStringBuilder.append(j.b.mf(this.thumbUrl));
      paramStringBuilder.append("</thumbUrl>");
    }
    if (!bo.isNullOrNil(this.uan))
    {
      paramStringBuilder.append("<shareTag>");
      paramStringBuilder.append(j.b.mf(this.uan));
      paramStringBuilder.append("</shareTag>");
    }
    paramStringBuilder.append("</websearch>");
    AppMethodBeat.o(124149);
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(124150);
    this.uaa = ((String)paramMap.get(".msg.appmsg.websearch.relevant_vid"));
    this.uab = ((String)paramMap.get(".msg.appmsg.websearch.relevant_expand"));
    this.uac = ((String)paramMap.get(".msg.appmsg.websearch.relevant_pre_searchid"));
    this.uad = ((String)paramMap.get(".msg.appmsg.websearch.relevant_shared_openid"));
    this.uae = bo.getInt((String)paramMap.get(".msg.appmsg.websearch.rec_category"), -1);
    this.lvz = ((String)paramMap.get(".msg.appmsg.websearch.shareUrl"));
    this.lvA = ((String)paramMap.get(".msg.appmsg.websearch.shareTitle"));
    this.qVw = ((String)paramMap.get(".msg.appmsg.websearch.shareDesc"));
    this.uaf = ((String)paramMap.get(".msg.appmsg.websearch.shareImgUrl"));
    this.uag = ((String)paramMap.get(".msg.appmsg.websearch.shareString"));
    this.uah = ((String)paramMap.get(".msg.appmsg.websearch.shareStringUrl"));
    this.source = ((String)paramMap.get(".msg.appmsg.websearch.source"));
    this.phw = ((String)paramMap.get(".msg.appmsg.websearch.sourceUrl"));
    this.uai = ((String)paramMap.get(".msg.appmsg.websearch.strPlayCount"));
    this.uaj = ((String)paramMap.get(".msg.appmsg.websearch.titleUrl"));
    this.uak = ((String)paramMap.get(".msg.appmsg.websearch.extReqParams"));
    this.ual = ((String)paramMap.get(".msg.appmsg.websearch.tagList"));
    this.uam = bo.getLong((String)paramMap.get(".msg.appmsg.websearch.channelId"), -1L);
    this.thumbUrl = ((String)paramMap.get(".msg.appmsg.websearch.thumbUrl"));
    this.uan = ((String)paramMap.get(".msg.appmsg.websearch.shareTag"));
    AppMethodBeat.o(124150);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ab
 * JD-Core Version:    0.6.2
 */