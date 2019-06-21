package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.z;

public final class d
{
  public static final int oIc;
  public static final int oIi;
  public static final int oIj;
  public Intent intent;
  public e sYX;
  private Point sYY;
  private a sYZ;
  private ap sZa;

  static
  {
    AppMethodBeat.i(4979);
    oIc = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 8);
    oIi = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 96);
    oIj = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 76);
    AppMethodBeat.o(4979);
  }

  private void as(Intent paramIntent)
  {
    AppMethodBeat.i(4974);
    ab.i("MicroMsg.VoipVoiceMiniManager", "mini now..");
    if (this.sYX != null)
      dismiss();
    if (this.sYX == null)
      this.sYX = new e(ah.getContext());
    if (this.sZa != null)
      this.sZa.stopTimer();
    this.sYX.setOnClickListener(new d.2(this, paramIntent));
    WindowManager localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    if (com.tencent.mm.compatible.util.d.iW(26))
      localLayoutParams.type = 2038;
    while (true)
    {
      localLayoutParams.format = 1;
      localLayoutParams.flags = 40;
      localLayoutParams.gravity = 51;
      localLayoutParams.width = oIj;
      localLayoutParams.height = oIi;
      if (this.sYY == null)
      {
        int i = g.RP().Ry().getInt(327947, 0);
        int j = oIc;
        localLayoutParams.x = (com.tencent.mm.bz.a.gd(ah.getContext()) - localLayoutParams.width - j);
        localLayoutParams.y = (i + j);
      }
      try
      {
        while (true)
        {
          localWindowManager.addView(this.sYX, localLayoutParams);
          this.sYZ.a(paramIntent, this.sYX);
          AppMethodBeat.o(4974);
          return;
          localLayoutParams.type = 2002;
          break;
          localLayoutParams.x = this.sYY.x;
          localLayoutParams.y = this.sYY.y;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.VoipVoiceMiniManager", "add failed", new Object[] { localException });
      }
    }
  }

  public final void Dq(int paramInt)
  {
    AppMethodBeat.i(4975);
    if (this.sYX != null)
    {
      String str = String.format("%02d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) });
      this.sYX.aca(str);
    }
    AppMethodBeat.o(4975);
  }

  public final void a(Intent paramIntent, a parama)
  {
    AppMethodBeat.i(4973);
    if (parama == null)
    {
      ab.e("MicroMsg.VoipVoiceMiniManager", "showMini, VoipMiniCallBack cannot be null!");
      AppMethodBeat.o(4973);
    }
    while (true)
    {
      return;
      this.intent = paramIntent;
      this.sYZ = parama;
      if (!b.bF(ah.getContext()))
      {
        ab.e("MicroMsg.VoipVoiceMiniManager", "mini, permission denied");
        Context localContext = ah.getContext();
        RequestFloatWindowPermissionDialog.a(localContext, localContext.getString(2131304416), new d.1(this, parama, paramIntent));
        AppMethodBeat.o(4973);
      }
      else
      {
        as(paramIntent);
        AppMethodBeat.o(4973);
      }
    }
  }

  public final void abZ(String paramString)
  {
    AppMethodBeat.i(4976);
    if (this.sYX != null)
      this.sYX.abZ(paramString);
    AppMethodBeat.o(4976);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(4977);
    ab.i("MicroMsg.VoipVoiceMiniManager", "dismiss now..");
    WindowManager localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
    try
    {
      if (this.sYX != null)
      {
        WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)this.sYX.getLayoutParams();
        Point localPoint = new android/graphics/Point;
        localPoint.<init>(localLayoutParams.x, localLayoutParams.y);
        this.sYY = localPoint;
        localWindowManager.removeView(this.sYX);
        this.sYX.setOnClickListener(null);
        this.sYX = null;
      }
      AppMethodBeat.o(4977);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.VoipVoiceMiniManager", "remove failed", new Object[] { localException });
        AppMethodBeat.o(4977);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.d
 * JD-Core Version:    0.6.2
 */