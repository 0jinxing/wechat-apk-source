package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public final class l
{
  private c hkR;
  public Context mContext;
  public Resources mResources;
  l.a nNK;

  public l(Context paramContext, l.a parama)
  {
    AppMethodBeat.i(113558);
    this.hkR = null;
    this.mContext = paramContext;
    this.nNK = parama;
    this.mResources = this.mContext.getResources();
    AppMethodBeat.o(113558);
  }

  public final void bKc()
  {
    AppMethodBeat.i(113559);
    Object localObject = g.RP().Ry().get(67590, null);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      if (bool)
        break label95;
      h.a(this.mContext, this.mResources.getString(2131300994), "", false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(113554);
          if (l.this.nNK != null)
            l.this.nNK.bKd();
          AppMethodBeat.o(113554);
        }
      }
      , new l.2(this));
      g.RP().Ry().set(67590, Boolean.TRUE);
      AppMethodBeat.o(113559);
    }
    while (true)
    {
      return;
      bool = ((Boolean)localObject).booleanValue();
      break;
      label95: if (this.nNK != null)
        this.nNK.bKd();
      AppMethodBeat.o(113559);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.l
 * JD-Core Version:    0.6.2
 */