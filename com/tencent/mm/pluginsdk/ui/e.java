package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class e
{
  private int version;
  public int vgW;
  public boolean vgX;
  public int vgY;
  public boolean vgZ;
  public boolean vha;
  private int vhb;
  public boolean vhc;
  public int vhd;
  public boolean vhe;

  public e(String paramString)
  {
    AppMethodBeat.i(105839);
    this.version = 0;
    this.vgW = -7829368;
    this.vgX = false;
    this.vgY = -1593835521;
    this.vgZ = false;
    this.vha = false;
    this.vhb = -16777216;
    this.vhc = false;
    this.vhd = 0;
    this.vhe = false;
    Map localMap = br.z(paramString, "chatbg");
    if (localMap == null)
    {
      ab.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed, values is null");
      AppMethodBeat.o(105839);
    }
    while (true)
    {
      return;
      paramString = ".".concat(String.valueOf("chatbg"));
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.version = bo.h(Integer.valueOf((String)localMap.get(paramString + ".$version")));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vgW = ((int)bo.a(Long.valueOf(Long.parseLong((String)localMap.get(paramString + ".$time_color"), 16)), -7829368L));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vgX = bo.e(Boolean.valueOf((String)localMap.get(paramString + ".$time_show_shadow_color")));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vgY = ((int)bo.a(Long.valueOf(Long.parseLong((String)localMap.get(paramString + ".$time_shadow_color"), 16)), 0L));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vgZ = bo.e(Boolean.valueOf((String)localMap.get(paramString + ".$time_show_background")));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vha = bo.e(Boolean.valueOf((String)localMap.get(paramString + ".$time_light_background")));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vhb = ((int)bo.a(Long.valueOf(Long.parseLong((String)localMap.get(paramString + ".$voice_second_color"), 16)), -16777216L));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vhc = bo.e(Boolean.valueOf((String)localMap.get(paramString + ".$voice_second_show_shadow_color")));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vhd = ((int)bo.a(Long.valueOf(Long.parseLong((String)localMap.get(paramString + ".$voice_second_shadow_color"), 16)), 0L));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        this.vhe = bo.e(Boolean.valueOf((String)localMap.get(paramString + ".$voice_second_show_background")));
        AppMethodBeat.o(105839);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed");
        ab.printErrStackTrace("MicroMsg.ChatBgAttr", paramString, "", new Object[0]);
        AppMethodBeat.o(105839);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e
 * JD-Core Version:    0.6.2
 */