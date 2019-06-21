package com.tencent.soter.a.g;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.e.b;
import com.tencent.soter.a.e.b.a;
import com.tencent.soter.a.f.e;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.g;

public final class l extends c
{
  String AvS = null;
  private boolean Axd = false;
  private boolean Axg = false;
  private int gOW = -1;
  e rOc = null;
  private e rOd = null;

  public l(int paramInt, e parame1, e parame2, boolean paramBoolean)
  {
    this.gOW = paramInt;
    this.rOc = parame1;
    this.Axd = paramBoolean;
    this.Axg = true;
    this.rOd = parame2;
  }

  private void dRv()
  {
    AppMethodBeat.i(10572);
    eQ(this.AvS, 1);
    b.a locala = new b.a().co(this.AvS, this.Axd);
    locala.AvV = new l.2(this);
    locala.dRj().dRi();
    AppMethodBeat.o(10572);
  }

  @SuppressLint({"DefaultLocale"})
  final boolean dRl()
  {
    AppMethodBeat.i(10569);
    boolean bool;
    if (!com.tencent.soter.a.c.a.dRe().isInit())
    {
      d.w("Soter.TaskPrepareAuthKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.soter.a.b.c(14));
      AppMethodBeat.o(10569);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!com.tencent.soter.a.c.a.dRe().dRc())
      {
        d.w("Soter.TaskPrepareAuthKey", "soter: not support soter", new Object[0]);
        b(new com.tencent.soter.a.b.c(2));
        AppMethodBeat.o(10569);
        bool = true;
      }
      else
      {
        this.AvS = ((String)com.tencent.soter.a.c.a.dRe().dRg().get(this.gOW, ""));
        if (g.isNullOrNil(this.AvS))
        {
          d.w("Soter.TaskPrepareAuthKey", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
          b(new com.tencent.soter.a.b.c(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.gOW) })));
          AppMethodBeat.o(10569);
          bool = true;
        }
        else
        {
          bool = com.tencent.soter.core.a.dQR();
          if ((!bool) && (com.tencent.soter.core.a.aua(this.AvS)))
          {
            d.w("Soter.TaskPrepareAuthKey", "soter: no ask but has auth key. delete the auth key as well", new Object[0]);
            com.tencent.soter.core.a.cn(this.AvS, false);
          }
          if ((!bool) && (!this.Axg))
          {
            d.w("Soter.TaskPrepareAuthKey", "soter: has not generate app secure key yet and not require to generate it", new Object[0]);
            b(new com.tencent.soter.a.b.c(3));
            AppMethodBeat.o(10569);
            bool = true;
          }
          else if ((com.tencent.soter.core.a.aua(this.AvS)) && (!com.tencent.soter.core.a.aub(this.AvS)))
          {
            d.w("Soter.TaskPrepareAuthKey", "soter: already has auth key but not valid. delete it already and re-generate", new Object[0]);
            AppMethodBeat.o(10569);
            bool = false;
          }
          else if ((com.tencent.soter.core.a.aua(this.AvS)) && (!this.Axd))
          {
            d.i("Soter.TaskPrepareAuthKey", "soter: already has key. do not need generate again", new Object[0]);
            b(new com.tencent.soter.a.b.c(com.tencent.soter.core.a.auc(this.AvS)));
            AppMethodBeat.o(10569);
            bool = true;
          }
          else
          {
            if (this.rOc == null)
              d.w("Soter.TaskPrepareAuthKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload AuthKey validation from server! Please make sure you upload it later", new Object[0]);
            AppMethodBeat.o(10569);
            bool = false;
          }
        }
      }
    }
  }

  final void dRm()
  {
    AppMethodBeat.i(10570);
    d.w("Soter.TaskPrepareAuthKey", "soter: cancelled prepare authkey: %s", new Object[] { this.AvS });
    com.tencent.soter.core.a.cn(this.AvS, false);
    AppMethodBeat.o(10570);
  }

  final void execute()
  {
    AppMethodBeat.i(10571);
    if ((!com.tencent.soter.core.a.dQR()) && (this.Axg))
    {
      d.d("Soter.TaskPrepareAuthKey", "soter: ask not found, but required to generate it. start generate", new Object[0]);
      com.tencent.soter.a.a.a(new l.1(this), false, this.rOd);
      AppMethodBeat.o(10571);
    }
    while (true)
    {
      return;
      dRv();
      AppMethodBeat.o(10571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.l
 * JD-Core Version:    0.6.2
 */