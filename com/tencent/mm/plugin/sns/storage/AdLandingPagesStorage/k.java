package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
{
  public String cFc;
  public int ecH;
  public long edh;
  public String extra;
  public String hxZ;
  public int lgf;
  public int mLz;
  public int meZ;
  public int mfa;
  public String qPj;
  public String qPm;
  public int qXp;
  public int reB;
  public int reC;
  public int reD;
  public int reE;
  public int reF;
  public int reG;
  public int reH;
  private String reI;
  public String reJ;
  public JSONArray reK;

  public k()
  {
    AppMethodBeat.i(37782);
    this.extra = "";
    this.reK = new JSONArray();
    AppMethodBeat.o(37782);
  }

  public final String cqm()
  {
    AppMethodBeat.i(37783);
    this.reI = this.reK.toString();
    ab.d("MicroMsg.AdLandingPagesReportInfo", "componentsStatStr:%s", new Object[] { this.reI });
    if (!bo.isNullOrNil(this.reI));
    try
    {
      this.reI = URLEncoder.encode(this.reI, "UTF-8");
      l1 = 0L;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      try
      {
        long l2 = i.Xq(this.cFc);
        long l1 = l2;
        StringBuilder localStringBuilder = new StringBuilder().append(i.jV(l1)).append(",").append(this.qPj).append(",").append(this.reB).append(",").append(this.ecH).append(",").append(this.lgf).append(",").append(this.reC).append(",").append(this.reD).append(",").append(this.reE).append(",").append(this.reF).append(",").append(this.reG).append(",").append(this.reH).append(",").append(this.mfa).append(",").append(this.meZ).append(",").append(this.mLz).append(",").append(this.reI).append(",").append(this.edh).append(",").append(this.reJ).append(",");
        if (this.qPm == null)
        {
          String str1 = "";
          str1 = str1 + "," + this.extra + "," + this.qXp + "," + this.hxZ;
          AppMethodBeat.o(37783);
          return str1;
          localUnsupportedEncodingException = localUnsupportedEncodingException;
          ab.e("MicroMsg.AdLandingPagesReportInfo", "not support encode " + localUnsupportedEncodingException.toString());
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("AdLandingPagesReportInfo", "", new Object[] { localException });
          continue;
          String str2 = this.qPm;
        }
      }
    }
  }

  public final void dk(List<h> paramList)
  {
    AppMethodBeat.i(37784);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      h localh = (h)paramList.next();
      if (!localh.cpv().qXb)
      {
        JSONObject localJSONObject = new JSONObject();
        if ((!localh.x(this.reK)) && (localh.al(localJSONObject)))
          this.reK.put(localJSONObject);
      }
    }
    AppMethodBeat.o(37784);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.k
 * JD-Core Version:    0.6.2
 */