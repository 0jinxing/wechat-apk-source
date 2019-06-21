package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e extends f
{
  public int duration = -1;
  public int ffZ = -1;
  public int fga = -1;
  public int fgb = 1;
  public int fgc = 0;
  public String fgd = "";
  public int videoHeight = -1;
  public int videoWidth = -1;

  public final f Xz()
  {
    AppMethodBeat.i(11207);
    Object localObject;
    if (this.ffZ == -1)
    {
      localObject = null;
      AppMethodBeat.o(11207);
    }
    while (true)
    {
      return localObject;
      localObject = new e();
      ((e)localObject).ffZ = this.ffZ;
      ((e)localObject).fga = this.fga;
      ((e)localObject).duration = this.duration;
      ((e)localObject).videoWidth = this.videoWidth;
      ((e)localObject).videoHeight = this.videoHeight;
      ((e)localObject).fgb = this.fgb;
      ((e)localObject).fgd = this.fgd;
      ((e)localObject).fgc = this.fgc;
      AppMethodBeat.o(11207);
    }
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(11208);
    if (this.ffZ != -1)
    {
      paramStringBuilder.append("<mmreadershare><itemshowtype>").append(this.ffZ).append("</itemshowtype>");
      if (this.ffZ == 5)
        paramStringBuilder.append("<pubtime>").append(this.fga).append("</pubtime><duration>").append(this.duration).append("</duration><width>").append(this.videoWidth).append("</width><height>").append(this.videoHeight).append("</height><nativepage>").append(this.fgb).append("</nativepage><funcflag>").append(this.fgc).append("</funcflag><vid>").append(bo.ani(this.fgd)).append("</vid>");
      paramStringBuilder.append("</mmreadershare>");
    }
    AppMethodBeat.o(11208);
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(11209);
    paramb = (String)paramMap.get(".msg.appmsg.mmreadershare.itemshowtype");
    if ((paramb != null) && (Pattern.compile("\\d").matcher(paramb).matches()))
      this.ffZ = Integer.valueOf(paramb).intValue();
    if (this.ffZ == 5)
    {
      this.fga = bo.getInt((String)paramMap.get(".msg.appmsg.mmreadershare.pubtime"), 0);
      this.duration = bo.getInt((String)paramMap.get(".msg.appmsg.mmreadershare.duration"), 0);
      this.videoWidth = bo.getInt((String)paramMap.get(".msg.appmsg.mmreadershare.width"), 0);
      this.videoHeight = bo.getInt((String)paramMap.get(".msg.appmsg.mmreadershare.height"), 0);
      this.fgb = bo.getInt((String)paramMap.get(".msg.appmsg.mmreadershare.nativepage"), 0);
      this.fgc = bo.getInt((String)paramMap.get(".msg.appmsg.mmreadershare.funcflag"), 0);
      this.fgd = ((String)paramMap.get(".msg.appmsg.mmreadershare.vid"));
    }
    AppMethodBeat.o(11209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.e
 * JD-Core Version:    0.6.2
 */