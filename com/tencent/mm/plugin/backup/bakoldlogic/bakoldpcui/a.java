package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.d;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

public final class a extends b
  implements e.d
{
  private static String TAG = "MicroMsg.BakChatBanner";
  private ak handler;
  private int jAo;
  private View jAp;
  private c jAq;
  private int jzK;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(17904);
    this.jzK = -1;
    this.jAo = 0;
    this.jAp = null;
    this.handler = new ak(Looper.getMainLooper());
    if (this.view != null)
    {
      this.jAp = this.view.findViewById(2131821630);
      this.jAp.setOnClickListener(new a.2(this));
    }
    aMN();
    this.jAq = new a.1(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.jAq);
    AppMethodBeat.o(17904);
  }

  private boolean fs(boolean paramBoolean)
  {
    AppMethodBeat.i(17905);
    this.jzK = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK;
    ab.d(TAG, "dealwithPCBakBanner PCBannerStatus:%d, setCallBack:%b", new Object[] { Integer.valueOf(this.jzK), Boolean.valueOf(paramBoolean) });
    if ((this.jzK >= 2) && (this.jzK <= 6))
    {
      this.jAp.setVisibility(0);
      if ((paramBoolean) && (!com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aUJ()))
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().a(this);
      if (2 == this.jzK)
      {
        ((ImageView)this.view.findViewById(2131821631)).setImageResource(2131231086);
        ((TextView)this.view.findViewById(2131821632)).setText(ah.getContext().getString(2131297370, new Object[] { Integer.valueOf(this.jAo) }));
        AppMethodBeat.o(17905);
      }
    }
    for (paramBoolean = true; ; paramBoolean = false)
    {
      return paramBoolean;
      if (3 == this.jzK)
      {
        ((ImageView)this.view.findViewById(2131821631)).setImageResource(2131231086);
        ((TextView)this.view.findViewById(2131821632)).setText(ah.getContext().getString(2131297373, new Object[] { Integer.valueOf(this.jAo) }));
        break;
      }
      if (4 == this.jzK)
      {
        ((TextView)this.view.findViewById(2131821632)).setText(ah.getContext().getString(2131297372));
        ((ImageView)this.view.findViewById(2131821631)).setImageResource(2131231085);
        break;
      }
      if (5 == this.jzK)
      {
        ((ImageView)this.view.findViewById(2131821631)).setImageResource(2131231086);
        ((TextView)this.view.findViewById(2131821632)).setText(ah.getContext().getString(2131297369, new Object[] { Integer.valueOf(this.jAo) }));
        break;
      }
      if (6 != this.jzK)
        break;
      ((TextView)this.view.findViewById(2131821632)).setText(ah.getContext().getString(2131297371));
      ((ImageView)this.view.findViewById(2131821631)).setImageResource(2131231085);
      break;
      this.jAp.setVisibility(8);
      AppMethodBeat.o(17905);
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(17906);
    this.jAo = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aUM();
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().a(this);
    boolean bool = fs(true);
    AppMethodBeat.o(17906);
    return bool;
  }

  public final void aSt()
  {
  }

  public final void aUP()
  {
    AppMethodBeat.i(17910);
    ab.d(TAG, "onNetFinish PCBannerStatus:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK) });
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC();
    e.rF(17);
    this.handler.post(new a.4(this));
    AppMethodBeat.o(17910);
  }

  public final void aUQ()
  {
  }

  public final void destroy()
  {
    AppMethodBeat.i(17911);
    com.tencent.mm.sdk.b.a.xxA.d(this.jAq);
    AppMethodBeat.o(17911);
  }

  public final int getLayoutId()
  {
    return 2130968811;
  }

  public final int getOrder()
  {
    return 3;
  }

  public final void onError(int paramInt)
  {
  }

  public final void rI(int paramInt)
  {
    AppMethodBeat.i(17908);
    ab.d(TAG, "onNetProgress PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK), Integer.valueOf(paramInt) });
    this.jAo = paramInt;
    this.handler.post(new a.3(this));
    AppMethodBeat.o(17908);
  }

  public final void rJ(int paramInt)
  {
    AppMethodBeat.i(17909);
    ab.d(TAG, "onMergeProgress PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().jzK), Integer.valueOf(paramInt) });
    AppMethodBeat.o(17909);
  }

  public final void release()
  {
    AppMethodBeat.i(17907);
    this.jzK = -1;
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.aUB().aUC().aUK();
    AppMethodBeat.o(17907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.a
 * JD-Core Version:    0.6.2
 */