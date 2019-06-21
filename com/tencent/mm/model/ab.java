package com.tencent.mm.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;

public final class ab
{
  private c flr;

  public ab(c paramc)
  {
    this.flr = paramc;
  }

  static int a(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    int i = 3;
    AppMethodBeat.i(16272);
    ad localad1 = c.XM().aoO(paramString);
    ad localad2 = localad1;
    if (localad1 == null)
      localad2 = new ad();
    if ((int)localad2.ewQ == 0)
    {
      localad2.setUsername(paramString);
      localad2.NB();
      y(localad2);
      if (paramBoolean2)
        i = 4;
      localad2.hz(i);
      localad2.NK();
      c.XM().Z(localad2);
      i = 1;
      AppMethodBeat.o(16272);
    }
    while (true)
    {
      return i;
      if (paramBoolean1)
      {
        localad2.NK();
        c.XM().b(paramString, localad2);
        i = 2;
        AppMethodBeat.o(16272);
      }
      else
      {
        AppMethodBeat.o(16272);
      }
    }
  }

  public static void x(ad paramad)
  {
    AppMethodBeat.i(16273);
    ad localad = paramad;
    if (paramad == null)
      localad = new ad();
    if ((int)localad.ewQ == 0)
    {
      localad.setUsername("filehelper");
      aw.ZK();
      if (c.XR().aoZ(localad.field_username) != null)
        break label83;
      localad.NC();
    }
    while (true)
    {
      localad.hz(3);
      aw.ZK();
      c.XM().Y(localad);
      AppMethodBeat.o(16273);
      return;
      label83: localad.NB();
    }
  }

  static void y(ad paramad)
  {
    AppMethodBeat.i(16274);
    String str = paramad.field_username;
    Context localContext = ah.getContext();
    if (str.equals("qqsync"))
    {
      paramad.iB(localContext.getString(2131300494));
      paramad.iC(localContext.getString(2131300495));
      paramad.iD(localContext.getString(2131300496));
    }
    if (str.equals("floatbottle"))
    {
      paramad.iB(localContext.getString(2131300443));
      paramad.iC(localContext.getString(2131300444));
      paramad.iD(localContext.getString(2131300445));
    }
    if (str.equals("shakeapp"))
    {
      paramad.iB(localContext.getString(2131300501));
      paramad.iC(localContext.getString(2131300502));
      paramad.iD(localContext.getString(2131300503));
    }
    if (str.equals("lbsapp"))
    {
      paramad.iB(localContext.getString(2131300466));
      paramad.iC(localContext.getString(2131300467));
      paramad.iD(localContext.getString(2131300468));
    }
    if (str.equals("medianote"))
    {
      paramad.iB(localContext.getString(2131300475));
      paramad.iC(localContext.getString(2131300476));
      paramad.iD(localContext.getString(2131300477));
    }
    if (str.equals("newsapp"))
    {
      paramad.iB(localContext.getString(2131300497));
      paramad.iC(localContext.getString(2131300498));
      paramad.iD(localContext.getString(2131300499));
    }
    if (str.equals("facebookapp"))
    {
      paramad.iB(localContext.getString(2131300452));
      paramad.iC(localContext.getString(2131300453));
      paramad.iD(localContext.getString(2131300454));
    }
    if (str.equals("qqfriend"))
    {
      paramad.iB(localContext.getString(2131300486));
      paramad.iC(localContext.getString(2131300487));
      paramad.iD(localContext.getString(2131300488));
    }
    if (str.equals("masssendapp"))
    {
      paramad.iB(localContext.getString(2131300472));
      paramad.iC(localContext.getString(2131300473));
      paramad.iD(localContext.getString(2131300474));
    }
    if (str.equals("feedsapp"))
    {
      paramad.iB(localContext.getString(2131300455));
      paramad.iC(localContext.getString(2131300456));
      paramad.iD(localContext.getString(2131300457));
    }
    if (str.equals("fmessage"))
    {
      paramad.iB(localContext.getString(2131300458));
      paramad.iC(localContext.getString(2131300459));
      paramad.iD(localContext.getString(2131300460));
    }
    if (str.equals("voipapp"))
    {
      paramad.iB(localContext.getString(2131300511));
      paramad.iC(localContext.getString(2131300512));
      paramad.iD(localContext.getString(2131300513));
    }
    if (str.equals("officialaccounts"))
    {
      paramad.iB(localContext.getString(2131300482));
      paramad.iC(localContext.getString(2131300483));
      paramad.iD(localContext.getString(2131300484));
    }
    if (str.equals("helper_entry"))
    {
      paramad.iB(localContext.getString(2131300463));
      paramad.iC(localContext.getString(2131300464));
      paramad.iD(localContext.getString(2131300465));
    }
    if (str.equals("cardpackage"))
    {
      paramad.iB(localContext.getString(2131300446));
      paramad.iC(localContext.getString(2131300447));
      paramad.iD(localContext.getString(2131300448));
    }
    if (str.equals("voicevoipapp"))
    {
      paramad.iB(localContext.getString(2131300514));
      paramad.iC(localContext.getString(2131300515));
      paramad.iD(localContext.getString(2131300516));
    }
    if (str.equals("voiceinputapp"))
    {
      paramad.iB(localContext.getString(2131300508));
      paramad.iC(localContext.getString(2131300509));
      paramad.iD(localContext.getString(2131300510));
    }
    if (str.equals("qqmail"))
    {
      paramad.iB(localContext.getString(2131300489));
      paramad.iC(localContext.getString(2131300490));
      paramad.iD(localContext.getString(2131300491));
    }
    if (str.equals("linkedinplugin"))
    {
      paramad.iB(localContext.getString(2131300469));
      paramad.iC(localContext.getString(2131300470));
      paramad.iD(localContext.getString(2131300471));
    }
    if (str.equals("notifymessage"))
    {
      paramad.iB(localContext.getString(2131300479));
      paramad.iC(localContext.getString(2131300480));
      paramad.iD(localContext.getString(2131300481));
    }
    if (str.equals("appbrandcustomerservicemsg"))
    {
      paramad.iB(localContext.getString(2131300440));
      paramad.iC(localContext.getString(2131300441));
      paramad.iD(localContext.getString(2131300442));
    }
    if (str.equals("downloaderapp"))
    {
      paramad.iB(localContext.getString(2131300449));
      paramad.iC(localContext.getString(2131300450));
      paramad.iD(localContext.getString(2131300451));
    }
    AppMethodBeat.o(16274);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ab
 * JD-Core Version:    0.6.2
 */