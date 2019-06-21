package com.tencent.mm.plugin.qmessage.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class a$a
{
  private String country = "";
  private String duc = "";
  private String dud = "";
  private String fBg = "";
  private String psX = "";
  private String psY = "";
  private String psZ = "";

  private a$a(a parama)
  {
  }

  public final String ccd()
  {
    if (this.psX == null);
    for (String str = ""; ; str = this.psX)
      return str;
  }

  public final String cce()
  {
    if (this.psY == null);
    for (String str = ""; ; str = this.psY)
      return str;
  }

  public final String ccf()
  {
    if (this.fBg == null);
    for (String str = ""; ; str = this.fBg)
      return str;
  }

  public final String ccg()
  {
    if (this.psZ == null);
    for (String str = ""; ; str = this.psZ)
      return str;
  }

  public final void parse(String paramString)
  {
    AppMethodBeat.i(24098);
    if (bo.nullAsNil(paramString).length() <= 0)
    {
      ab.e("MicroMsg.ContactWidgetQContact", "QExtInfoContent : parse xml, but xml is null");
      AppMethodBeat.o(24098);
      return;
    }
    paramString = br.z(paramString, "extinfo");
    if (paramString != null)
    {
      this.psX = ((String)paramString.get(".extinfo.sex"));
      this.psY = ((String)paramString.get(".extinfo.age"));
      this.psZ = ((String)paramString.get(".extinfo.bd"));
      this.country = ((String)paramString.get(".extinfo.country"));
      this.duc = ((String)paramString.get(".extinfo.province"));
      this.dud = ((String)paramString.get(".extinfo.city"));
    }
    if ((this.psX != null) && (this.psX.equals("1")));
    for (this.psX = this.psW.context.getString(2131303380); ; this.psX = this.psW.context.getString(2131303379))
    {
      if (this.country != null)
        this.fBg = (this.fBg + this.country + " ");
      if (this.duc != null)
        this.fBg = (this.fBg + this.duc + " ");
      if (this.dud != null)
        this.fBg += this.dud;
      AppMethodBeat.o(24098);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.a.a
 * JD-Core Version:    0.6.2
 */