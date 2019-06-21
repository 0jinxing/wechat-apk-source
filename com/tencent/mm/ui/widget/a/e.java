package com.tencent.mm.ui.widget.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.AlertActivity;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.e.c.b;

public final class e
{
  public static final class a
  {
    public c gud;
    public Context mContext;
    public final c.a vkm;
    public String zQJ;
    public String zQK;
    public boolean zQL;
    public boolean zQM;
    public RadioGroup zQN;

    public a(Context paramContext)
    {
      AppMethodBeat.i(112675);
      this.zQJ = null;
      this.zQK = null;
      this.zQL = false;
      this.zQM = false;
      this.mContext = paramContext;
      this.vkm = new c.a(this.mContext);
      this.vkm.rc(false);
      this.vkm.rd(false);
      this.vkm.a(new c.a.d()
      {
        public final CharSequence a(CharSequence paramAnonymousCharSequence, float paramAnonymousFloat)
        {
          AppMethodBeat.i(112670);
          paramAnonymousCharSequence = b.c(e.a.this.mContext, paramAnonymousCharSequence, paramAnonymousFloat);
          AppMethodBeat.o(112670);
          return paramAnonymousCharSequence;
        }
      });
      AppMethodBeat.o(112675);
    }

    public final a Qg(int paramInt)
    {
      AppMethodBeat.i(112685);
      this.zQJ = this.mContext.getResources().getString(paramInt);
      AppMethodBeat.o(112685);
      return this;
    }

    public final a Qh(int paramInt)
    {
      AppMethodBeat.i(112686);
      this.vkm.Qe(paramInt);
      AppMethodBeat.o(112686);
      return this;
    }

    public final a a(final e.b paramb)
    {
      AppMethodBeat.i(112691);
      if (this.zQN != null)
        this.zQN.setTag(this.gud);
      if ((this.zQJ == null) || ((this.zQJ != null) && (this.zQJ.length() == 0)))
        this.zQJ = this.mContext.getResources().getString(2131297764);
      this.vkm.asJ(this.zQJ);
      this.vkm.a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(112673);
          if (paramb != null)
          {
            if (paramAnonymousDialogInterface != null)
              ((c)paramAnonymousDialogInterface).dKV();
            if (paramAnonymousDialogInterface != null)
              break label47;
          }
          label47: for (boolean bool = false; ; bool = ((c)paramAnonymousDialogInterface).aaY.isChecked())
          {
            paramb.s(true, bool);
            AppMethodBeat.o(112673);
            return;
          }
        }
      });
      if ((this.zQK == null) || ((this.zQK != null) && (this.zQK.length() == 0)))
        this.zQK = this.mContext.getResources().getString(2131297763);
      this.vkm.asK(this.zQK);
      if (!this.zQM)
        this.vkm.b(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(112674);
            if (paramb != null)
              if (paramAnonymousDialogInterface != null)
                break label35;
            label35: for (boolean bool = false; ; bool = ((c)paramAnonymousDialogInterface).aaY.isChecked())
            {
              paramb.s(false, bool);
              AppMethodBeat.o(112674);
              return;
            }
          }
        });
      AppMethodBeat.o(112691);
      return this;
    }

    public final a a(final e.c paramc)
    {
      AppMethodBeat.i(112688);
      if ((this.zQK == null) || ((this.zQK != null) && (this.zQK.length() == 0)))
        this.zQK = this.mContext.getResources().getString(2131297763);
      this.vkm.asK(this.zQK);
      if (!this.zQM)
        this.vkm.b(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(112671);
            if (paramc != null)
              paramc.d(false, null);
            AppMethodBeat.o(112671);
          }
        });
      AppMethodBeat.o(112688);
      return this;
    }

    public final a a(e.c paramc1, e.c paramc2)
    {
      AppMethodBeat.i(112687);
      if (this.zQN != null)
        this.zQN.setTag(this.gud);
      a(paramc1);
      b(paramc2);
      if (this.zQL)
        this.vkm.Qf(this.mContext.getResources().getColor(2131689776));
      AppMethodBeat.o(112687);
      return this;
    }

    public final a al(CharSequence paramCharSequence)
    {
      AppMethodBeat.i(112677);
      int i = aj.fromDPToPix(this.mContext, (int)(20.0F * aj.dm(this.mContext)));
      if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
      {
        CharSequence localCharSequence = b.h(this.mContext, paramCharSequence.toString(), i);
        this.vkm.ai(localCharSequence);
      }
      this.vkm.ai(paramCharSequence);
      AppMethodBeat.o(112677);
      return this;
    }

    public final a am(CharSequence paramCharSequence)
    {
      AppMethodBeat.i(112679);
      int i = aj.fromDPToPix(this.mContext, (int)(14.0F * aj.dm(this.mContext)));
      if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
      {
        CharSequence localCharSequence = b.h(this.mContext, paramCharSequence.toString(), i);
        this.vkm.ak(localCharSequence);
      }
      this.vkm.ak(paramCharSequence);
      AppMethodBeat.o(112679);
      return this;
    }

    public final a asL(String paramString)
    {
      AppMethodBeat.i(112678);
      this.vkm.asE(paramString);
      AppMethodBeat.o(112678);
      return this;
    }

    public final a asM(String paramString)
    {
      AppMethodBeat.i(112680);
      this.vkm.asF(paramString);
      AppMethodBeat.o(112680);
      return this;
    }

    public final a asN(String paramString)
    {
      AppMethodBeat.i(112683);
      this.vkm.asH(paramString);
      AppMethodBeat.o(112683);
      return this;
    }

    public final a asO(String paramString)
    {
      AppMethodBeat.i(112684);
      this.vkm.asI(paramString);
      AppMethodBeat.o(112684);
      return this;
    }

    public final a asP(String paramString)
    {
      this.zQJ = paramString;
      return this;
    }

    public final a b(DialogInterface.OnDismissListener paramOnDismissListener)
    {
      AppMethodBeat.i(112692);
      this.vkm.a(paramOnDismissListener);
      AppMethodBeat.o(112692);
      return this;
    }

    public final a b(final e.c paramc)
    {
      AppMethodBeat.i(112689);
      if ((this.zQJ == null) || ((this.zQJ != null) && (this.zQJ.length() == 0)))
        this.zQJ = this.mContext.getResources().getString(2131297764);
      this.vkm.asJ(this.zQJ);
      this.vkm.a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(112672);
          if (paramc != null)
            if (paramAnonymousDialogInterface != null)
              break label35;
          label35: for (paramAnonymousDialogInterface = null; ; paramAnonymousDialogInterface = ((c)paramAnonymousDialogInterface).dKV())
          {
            paramc.d(true, paramAnonymousDialogInterface);
            AppMethodBeat.o(112672);
            return;
          }
        }
      });
      AppMethodBeat.o(112689);
      return this;
    }

    public final a c(e.c paramc)
    {
      AppMethodBeat.i(112690);
      if (this.zQN != null)
        this.zQN.setTag(this.gud);
      b(paramc);
      a(paramc);
      AppMethodBeat.o(112690);
      return this;
    }

    public final a fo(View paramView)
    {
      AppMethodBeat.i(112681);
      this.vkm.fn(paramView);
      AppMethodBeat.o(112681);
      return this;
    }

    public final a m(Boolean paramBoolean)
    {
      AppMethodBeat.i(112682);
      this.vkm.rb(paramBoolean.booleanValue());
      AppMethodBeat.o(112682);
      return this;
    }

    public final a re(boolean paramBoolean)
    {
      AppMethodBeat.i(112676);
      this.vkm.rc(paramBoolean);
      this.vkm.rd(paramBoolean);
      AppMethodBeat.o(112676);
      return this;
    }

    public final void show()
    {
      AppMethodBeat.i(112693);
      if ((this.mContext instanceof Activity))
      {
        if (this.gud == null)
          this.gud = this.vkm.aMb();
        this.gud.show();
        AppMethodBeat.o(112693);
      }
      while (true)
      {
        return;
        AlertActivity.a(this.vkm);
        Intent localIntent = new Intent(this.mContext, AlertActivity.class);
        localIntent.setFlags(335544320);
        this.mContext.startActivity(localIntent);
        AppMethodBeat.o(112693);
      }
    }
  }

  public static abstract interface b
  {
    public abstract void s(boolean paramBoolean1, boolean paramBoolean2);
  }

  public static abstract interface c
  {
    public abstract void d(boolean paramBoolean, String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.e
 * JD-Core Version:    0.6.2
 */