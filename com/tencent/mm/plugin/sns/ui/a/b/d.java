package com.tencent.mm.plugin.sns.ui.a.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class d extends a
{
  public boolean czr;
  public String userName;

  public d(String paramString, boolean paramBoolean)
  {
    super(new n());
    AppMethodBeat.i(39956);
    this.userName = paramString;
    this.czr = paramBoolean;
    dLZ();
    AppMethodBeat.o(39956);
  }

  public final Cursor cuR()
  {
    AppMethodBeat.i(39957);
    init();
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(2, null);
    if (this.userName.equals(localObject));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.SnsUserPageVending", "prepareCursorAsynchronous");
      localObject = af.cnF().e(this.userName, bool, cuO());
      AppMethodBeat.o(39957);
      return localObject;
    }
  }

  public final String w(long paramLong, String paramString)
  {
    AppMethodBeat.i(39958);
    ab.d("MicroMsg.SnsUserPageVending", "updateLitmitSeq %s %s", new Object[] { Integer.valueOf(af.cnv().cod()), paramString });
    Object localObject = i.jW(af.cnF().a(paramLong, af.cnv().Yc(this.userName), this.userName, this.czr));
    if (this.rmL.equals(""))
    {
      paramString = (String)localObject;
      localObject = af.cnJ().YX(this.userName).cqL();
      if (((aao)localObject).wfM != 0L)
        break label132;
      AppMethodBeat.o(39958);
    }
    while (true)
    {
      return paramString;
      paramString = (String)localObject;
      if (((String)localObject).compareTo(this.rmL) < 0)
        break;
      paramString = this.rmL;
      break;
      label132: localObject = i.jW(((aao)localObject).wfM);
      if (paramString.equals(""))
      {
        AppMethodBeat.o(39958);
        paramString = (String)localObject;
      }
      else if (((String)localObject).compareTo(paramString) > 0)
      {
        AppMethodBeat.o(39958);
        paramString = (String)localObject;
      }
      else
      {
        AppMethodBeat.o(39958);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.a.b.d
 * JD-Core Version:    0.6.2
 */