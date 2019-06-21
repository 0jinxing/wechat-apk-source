package com.tencent.mm.ui.contact;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r extends q
{
  private ak handler;
  private String query;
  private m.a zmU;
  private Map<String, String> znB;
  private List<String> znC;
  private List<String> znn;

  public r(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, String paramString)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean, 0);
    AppMethodBeat.i(105251);
    this.znB = new HashMap();
    this.znC = new ArrayList();
    this.handler = new ak(Looper.getMainLooper());
    this.znn = paramList;
    if (!bo.isNullOrNil(paramString))
    {
      this.znC = bo.P(paramString.split(","));
      if (this.znC != null)
      {
        paramString = this.znC.iterator();
        while (paramString.hasNext())
        {
          paramMMBaseSelectContactUI = (String)paramString.next();
          paramList = ((b)g.K(b.class)).mJ(paramMMBaseSelectContactUI);
          if (!bo.isNullOrNil(paramList))
            this.znB.put(paramList, paramMMBaseSelectContactUI);
        }
      }
    }
    Kh();
    AppMethodBeat.o(105251);
  }

  private void Kh()
  {
    AppMethodBeat.i(105253);
    this.query = null;
    clearCache();
    AppMethodBeat.o(105253);
  }

  public final void a(m.a parama)
  {
    this.zmU = parama;
  }

  protected final boolean c(a parama)
  {
    return true;
  }

  public final void ci(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105252);
    if (this.zmU != null)
      this.zmU.w(paramString, getCount(), paramBoolean);
    AppMethodBeat.o(105252);
  }

  public final void finish()
  {
    AppMethodBeat.i(105256);
    super.finish();
    Kh();
    AppMethodBeat.o(105256);
  }

  public final int getCount()
  {
    AppMethodBeat.i(105254);
    int i;
    if (this.znC == null)
    {
      i = 0;
      AppMethodBeat.o(105254);
    }
    while (true)
    {
      return i;
      i = this.znC.size();
      AppMethodBeat.o(105254);
    }
  }

  protected final a mP(int paramInt)
  {
    AppMethodBeat.i(105255);
    e locale = new e(paramInt);
    locale.query = this.query;
    g.RQ();
    locale.ehM = ((j)g.K(j.class)).XM().aoM((String)this.znC.get(paramInt));
    locale.zmW = clI();
    AppMethodBeat.o(105255);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.r
 * JD-Core Version:    0.6.2
 */