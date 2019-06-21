package com.tencent.mm.pluginsdk.ui.applet;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import java.util.LinkedList;

public final class b
  implements d.a, a.a, o
{
  private String eFp;
  private int gOW;
  ProgressDialog gqo;
  c iHe;
  String igi;
  ad ldh;
  Context mContext;
  private n vjS;
  com.tencent.mm.ai.f vjT = null;
  private boolean vjU = true;

  public b(Context paramContext, String paramString1, int paramInt, n paramn, String paramString2)
  {
    this(paramContext, paramString1, paramInt, paramn, true, paramString2);
  }

  public b(Context paramContext, String paramString1, int paramInt, n paramn, boolean paramBoolean, String paramString2)
  {
    this.mContext = paramContext;
    this.igi = paramString1;
    this.gOW = paramInt;
    this.vjS = paramn;
    this.vjU = paramBoolean;
    this.eFp = paramString2;
  }

  public b(Context paramContext, String paramString, n paramn)
  {
    this(paramContext, paramString, 0, paramn, true, "");
  }

  private void ajx(String paramString)
  {
    AppMethodBeat.i(27633);
    ab.i("MicroMsg.AddContactDialog", "searchContact %s", new Object[] { paramString });
    if (this.vjT == null)
      this.vjT = new b.4(this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(106, this.vjT);
    paramString = new com.tencent.mm.plugin.messenger.a.f(paramString);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(27633);
  }

  final void U(final ad paramad)
  {
    AppMethodBeat.i(27630);
    if (paramad == null)
    {
      ab.e("MicroMsg.AddContactDialog", "showContact fail, contact is null");
      kx(-1);
      AppMethodBeat.o(27630);
    }
    while (true)
    {
      return;
      String str = this.mContext.getString(2131305703);
      Object localObject1 = com.tencent.mm.ah.b.a(paramad.field_username, false, -1);
      if (localObject1 == null)
        com.tencent.mm.ah.o.acd().a(this);
      Object localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (paramad.dsf())
          localObject2 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, false, ((Bitmap)localObject1).getWidth() / 2);
      }
      localObject1 = paramad.field_nickname;
      this.iHe = null;
      if ((this.mContext instanceof MMActivity))
      {
        if (!this.vjU)
        {
          V(paramad);
          AppMethodBeat.o(27630);
        }
        else
        {
          this.iHe = g.a(((MMActivity)this.mContext).mController, str, (Bitmap)localObject2, (String)localObject1, "", new q.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              AppMethodBeat.i(27625);
              if (paramAnonymousBoolean)
                b.this.V(paramad);
              while (true)
              {
                b.this.iHe.dismiss();
                AppMethodBeat.o(27625);
                return;
                b.this.kx(0);
              }
            }
          });
        }
      }
      else
      {
        if (this.iHe == null)
        {
          ab.e("MicroMsg.AddContactDialog", "showContact fail, cannot show dialog");
          kx(-1);
        }
        AppMethodBeat.o(27630);
      }
    }
  }

  final void V(ad paramad)
  {
    AppMethodBeat.i(27631);
    if (this.gqo != null)
      this.gqo.dismiss();
    Object localObject = this.mContext;
    this.mContext.getString(2131297061);
    this.gqo = h.b((Context)localObject, this.mContext.getString(2131305706), true, null);
    a locala = new a(this.mContext, this);
    localObject = new LinkedList();
    ((LinkedList)localObject).add(Integer.valueOf(this.gOW));
    locala.a(paramad.field_username, (LinkedList)localObject, this.eFp);
    AppMethodBeat.o(27631);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(27634);
    if (this.gqo != null)
      this.gqo.dismiss();
    if (paramBoolean1)
    {
      this.ldh.NB();
      com.tencent.mm.kernel.g.RQ();
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this.ldh.field_username, this.ldh);
      h.bQ(this.mContext, this.mContext.getResources().getString(2131305709));
      kx(1);
      AppMethodBeat.o(27634);
    }
    while (true)
    {
      return;
      kx(-1);
      AppMethodBeat.o(27634);
    }
  }

  final void kx(int paramInt)
  {
    AppMethodBeat.i(27635);
    if (this.vjS != null)
      this.vjS.nZ(paramInt);
    AppMethodBeat.o(27635);
  }

  public final void qj(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(27632);
    int j;
    if (this.ldh != null)
      if ((this.ldh.field_username != null) && (this.ldh.field_username.equals(paramString)))
      {
        j = 1;
        if ((this.ldh.Hq() == null) || (!this.ldh.Hq().equals(paramString)))
          break label85;
        label65: if ((j != 0) || (i != 0))
          break label117;
        AppMethodBeat.o(27632);
      }
    while (true)
    {
      return;
      j = 0;
      break;
      label85: i = 0;
      break label65;
      if ((this.igi == null) || (!this.igi.equals(paramString)))
        AppMethodBeat.o(27632);
      else
        label117: if ((this.iHe == null) || (!this.iHe.isShowing()))
        {
          AppMethodBeat.o(27632);
        }
        else
        {
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(27626);
              ImageView localImageView = (ImageView)b.this.iHe.getContentView().findViewById(2131822922);
              if (localImageView != null)
              {
                Bitmap localBitmap1 = com.tencent.mm.ah.b.a(b.this.ldh.field_username, false, -1);
                Bitmap localBitmap2 = localBitmap1;
                if (localBitmap1 != null)
                {
                  localBitmap2 = localBitmap1;
                  if (b.this.ldh.dsf())
                    localBitmap2 = com.tencent.mm.sdk.platformtools.d.a(localBitmap1, false, localBitmap1.getWidth() / 2);
                }
                if ((localBitmap2 != null) && (!localBitmap2.isRecycled()))
                {
                  localImageView.setImageBitmap(localBitmap2);
                  localImageView.setVisibility(0);
                }
              }
              AppMethodBeat.o(27626);
            }
          });
          AppMethodBeat.o(27632);
        }
    }
  }

  public final void show()
  {
    AppMethodBeat.i(27629);
    com.tencent.mm.kernel.g.RQ();
    this.ldh = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.igi);
    if ((this.ldh != null) && ((int)this.ldh.ewQ <= 0))
    {
      ab.i("MicroMsg.AddContactDialog", "dealAddContact get by username fail, try alias, %s", new Object[] { this.igi });
      com.tencent.mm.kernel.g.RQ();
      this.ldh = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoK(this.igi);
    }
    if ((this.ldh != null) && ((int)this.ldh.ewQ > 0))
    {
      ab.i("MicroMsg.AddContactDialog", "The contact already exists, so go to dealAddContact.");
      if (this.ldh == null)
      {
        ab.e("MicroMsg.AddContactDialog", "dealAddContact fail, contact is null");
        kx(-1);
        AppMethodBeat.o(27629);
      }
    }
    while (true)
    {
      return;
      Object localObject = this.ldh.field_username;
      if (!this.ldh.dsf())
      {
        if (((com.tencent.mm.api.j)com.tencent.mm.kernel.g.K(com.tencent.mm.api.j.class)).cJ((String)localObject))
        {
          Context localContext = this.mContext;
          this.mContext.getString(2131297061);
          this.gqo = h.b(localContext, this.mContext.getString(2131305706), true, null);
          ajx((String)localObject);
          AppMethodBeat.o(27629);
        }
        else
        {
          localObject = BitmapFactory.decodeResource(this.mContext.getResources(), 2130838421);
          if (((this.mContext instanceof MMActivity)) && (g.a(((MMActivity)this.mContext).mController, (Bitmap)localObject, this.mContext.getResources().getString(2131305711), new b.5(this)) == null))
          {
            ab.e("MicroMsg.AddContactDialog", "dealAddContact fail, connot show dialog");
            kx(-1);
          }
          AppMethodBeat.o(27629);
        }
      }
      else if (com.tencent.mm.n.a.jh(this.ldh.field_type))
      {
        h.bQ(this.mContext, this.mContext.getResources().getString(2131305709));
        kx(-2);
        AppMethodBeat.o(27629);
      }
      else
      {
        U(this.ldh);
        AppMethodBeat.o(27629);
        continue;
        if (this.mContext == null)
        {
          AppMethodBeat.o(27629);
        }
        else
        {
          localObject = this.mContext;
          this.mContext.getString(2131297061);
          this.gqo = h.b((Context)localObject, this.mContext.getString(2131305706), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              AppMethodBeat.i(27624);
              if (b.this.gqo != null)
              {
                b.this.gqo.dismiss();
                b.this.gqo = null;
              }
              AppMethodBeat.o(27624);
            }
          });
          ajx(this.igi);
          AppMethodBeat.o(27629);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.b
 * JD-Core Version:    0.6.2
 */