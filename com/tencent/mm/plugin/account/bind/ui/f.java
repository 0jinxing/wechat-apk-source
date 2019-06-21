package com.tencent.mm.plugin.account.bind.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.y;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cna;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public final class f
  implements com.tencent.mm.ai.f
{
  Context context;
  private View gub;
  com.tencent.mm.ui.base.p guc;
  c gud;
  SecurityImage gue;
  String guf;
  private byte[] gug;
  private String guh;
  private String gui;
  private a guj;

  public f(Context paramContext, a parama)
  {
    this.context = paramContext;
    this.gub = null;
    this.guc = null;
    this.gud = null;
    this.guf = "";
    this.gue = null;
    this.gug = null;
    this.guh = "";
    this.guj = parama;
  }

  public final void Xy()
  {
    AppMethodBeat.i(13757);
    g.Rg().a(384, this);
    AppMethodBeat.o(13757);
  }

  public final void apv()
  {
    AppMethodBeat.i(13759);
    this.gub = View.inflate(this.context, 2130970616, null);
    Object localObject = (EditText)this.gub.findViewById(2131827351);
    ((EditText)localObject).setHint(2131297622);
    localObject = new f.1(this, (EditText)localObject);
    f.2 local2 = new f.2(this);
    this.gud = h.a(this.context, this.context.getString(2131297617), this.gub, (DialogInterface.OnClickListener)localObject, local2);
    AppMethodBeat.o(13759);
  }

  public final void onDetach()
  {
    AppMethodBeat.i(13758);
    g.Rg().b(384, this);
    if (this.guj != null)
      this.guj.apu();
    AppMethodBeat.o(13758);
  }

  @TargetApi(17)
  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13760);
    onDetach();
    if ((paramm == null) || (paramm.getType() != 384))
      AppMethodBeat.o(13760);
    while (true)
    {
      return;
      if (this.guc != null)
      {
        this.guc.dismiss();
        this.guc = null;
      }
      this.guh = com.tencent.mm.platformtools.aa.a(((cna)((com.tencent.mm.modelsimple.aa)paramm).ehh.fsH.fsP).wtZ);
      paramm = (com.tencent.mm.modelsimple.aa)paramm;
      if ((((cna)paramm.ehh.fsH.fsP).vHJ != null) && (((cna)paramm.ehh.fsH.fsP).vHJ.getILen() > 0));
      for (paramm = g.RN().QR().fs(paramm.fPN); ; paramm = com.tencent.mm.platformtools.aa.a(((cna)paramm.ehh.fsH.fsP).vEF))
      {
        this.gug = paramm;
        if ((this.guj == null) || (!this.guj.cL(paramInt1, paramInt2)))
          break label206;
        AppMethodBeat.o(13760);
        break;
      }
      label206: if ((this.context instanceof Activity))
      {
        paramm = (Activity)this.context;
        if ((paramm.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramm.isDestroyed())))
          AppMethodBeat.o(13760);
      }
      else if (paramInt1 == 4)
      {
        switch (paramInt2)
        {
        default:
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this.context, null, null);
            AppMethodBeat.o(13760);
          }
          break;
        case -311:
        case -310:
        case -6:
          if (g.RK())
          {
            if (this.gue == null)
            {
              this.gue = SecurityImage.a.a(this.context, 0, this.gug, this.guh, this.gui, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  AppMethodBeat.i(13755);
                  com.tencent.mm.modelsimple.aa localaa = new com.tencent.mm.modelsimple.aa(5, f.this.guf, f.this.gue.getSecImgSid(), f.this.gue.getSecImgCode(), f.this.gue.getSecImgEncryptKey(), true, 1);
                  f.this.Xy();
                  g.Rg().a(localaa, 0);
                  f localf = f.this;
                  paramAnonymousDialogInterface = f.this.context;
                  f.this.context.getString(2131297061);
                  localf.guc = h.b(paramAnonymousDialogInterface, f.this.context.getString(2131301031), true, new f.5.1(this, localaa));
                  AppMethodBeat.o(13755);
                }
              }
              , null, new f.6(this), new f.b(this));
              AppMethodBeat.o(13760);
              continue;
            }
            this.gue.b(0, this.gug, this.guh, this.gui);
          }
          AppMethodBeat.o(13760);
          break;
        case -3:
          paramString = new f.4(this);
          this.gud = h.a(this.context, this.context.getString(2131297621), this.context.getString(2131297061), paramString, null);
          AppMethodBeat.o(13760);
          break;
        case -72:
          this.gud = h.g(this.context, 2131298189, 2131297061);
          AppMethodBeat.o(13760);
          break;
        case -34:
          this.gud = h.b(this.context, this.context.getString(2131297614), this.context.getString(2131297061), true);
          AppMethodBeat.o(13760);
          continue;
          AppMethodBeat.o(13760);
          break;
        }
      }
      else
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if (paramString != null)
        {
          paramString.a(this.context, null, null);
          AppMethodBeat.o(13760);
        }
        else
        {
          AppMethodBeat.o(13760);
        }
      }
    }
  }

  public static abstract interface a
  {
    public abstract void apu();

    public abstract boolean cL(int paramInt1, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.f
 * JD-Core Version:    0.6.2
 */