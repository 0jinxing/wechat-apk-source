package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.ai.j.b;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.masssend.a.a;
import com.tencent.mm.plugin.masssend.a.f;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.base.t;
import java.util.List;

public final class b
  implements com.tencent.mm.pluginsdk.ui.chat.b
{
  final ap gci;
  private Vibrator kgA;
  long miD;
  Toast miE;
  final ap miP;
  MassSendMsgUI ooq;
  ChatFooter oor;
  b.a oos;
  ToneGenerator oot;
  private String oou;
  private List<String> oov;
  private boolean oow;
  private final j.a oox;
  private final j.b ooy;
  com.tencent.mm.ui.base.p tipDialog;

  public b(MassSendMsgUI paramMassSendMsgUI, ChatFooter paramChatFooter, String paramString, List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(22775);
    this.miD = -1L;
    this.tipDialog = null;
    this.gci = new ap(new b.1(this), true);
    this.oox = new b.2(this);
    this.ooy = new b.3(this);
    this.miP = new ap(new b.4(this), true);
    this.ooq = paramMassSendMsgUI;
    this.oor = paramChatFooter;
    this.oou = paramString;
    this.oov = paramList;
    this.oow = paramBoolean;
    this.oos = new b.a(this, paramMassSendMsgUI);
    this.oos.a(this.oox);
    this.oos.a(this.ooy);
    this.oot = new ToneGenerator(1, 60);
    this.kgA = ((Vibrator)paramMassSendMsgUI.getSystemService("vibrator"));
    AppMethodBeat.o(22775);
  }

  public final void I(MotionEvent paramMotionEvent)
  {
  }

  public final boolean Qu(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(22780);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(22780);
      bool = false;
    }
    while (true)
    {
      return bool;
      MassSendMsgUI.Qy(paramString);
      Object localObject = new a();
      ((a)localObject).onZ = this.oou;
      ((a)localObject).ooa = this.oov.size();
      ((a)localObject).filename = paramString;
      ((a)localObject).msgType = 1;
      paramString = new f((a)localObject, this.oow);
      aw.Rg().a(paramString, 0);
      localObject = this.ooq;
      this.ooq.getString(2131297061);
      this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject, this.ooq.getString(2131302962), true, new b.7(this, paramString));
      AppMethodBeat.o(22780);
    }
  }

  public final boolean bNG()
  {
    AppMethodBeat.i(22776);
    this.gci.stopTimer();
    this.miP.stopTimer();
    this.miD = -1L;
    if (this.oos.EH())
    {
      bNH();
      this.oor.bvH();
    }
    while (true)
    {
      aw.Cc().Ic();
      AppMethodBeat.o(22776);
      return false;
      this.oor.ddN();
    }
  }

  final void bNH()
  {
    AppMethodBeat.i(22777);
    Object localObject = new a();
    ((a)localObject).onZ = this.oou;
    ((a)localObject).ooa = this.oov.size();
    ((a)localObject).filename = this.oos.fileName;
    ((a)localObject).msgType = 34;
    ((a)localObject).oob = this.oos.cqD;
    final f localf = new f((a)localObject, this.oow);
    aw.Rg().a(localf, 0);
    localObject = this.ooq;
    this.ooq.getString(2131297061);
    this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject, this.ooq.getString(2131302962), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(22771);
        aw.Rg().c(localf);
        if (b.this.tipDialog != null)
        {
          b.this.tipDialog.dismiss();
          b.this.tipDialog = null;
        }
        AppMethodBeat.o(22771);
      }
    });
    AppMethodBeat.o(22777);
  }

  public final boolean bNI()
  {
    AppMethodBeat.i(22778);
    this.gci.stopTimer();
    this.miP.stopTimer();
    this.miD = -1L;
    this.oor.bvH();
    b.a locala = this.oos;
    locala.EH();
    q.uT(locala.fileName);
    aw.Cc().Ic();
    AppMethodBeat.o(22778);
    return false;
  }

  public final boolean bNJ()
  {
    AppMethodBeat.i(22779);
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      t.hO(this.ooq);
      AppMethodBeat.o(22779);
    }
    while (true)
    {
      return false;
      this.oot.startTone(24);
      new ak().postDelayed(new b.6(this), 200L);
      this.kgA.vibrate(50L);
      this.gci.ae(100L, 100L);
      this.miP.ae(200L, 200L);
      DisplayMetrics localDisplayMetrics = this.ooq.getResources().getDisplayMetrics();
      this.oor.Le(localDisplayMetrics.heightPixels - this.oor.getHeight());
      this.oos.em("_USER_FOR_THROWBOTTLE_");
      this.oos.a(this.ooy);
      this.oos.a(this.oox);
      aw.Cc().Id();
      AppMethodBeat.o(22779);
    }
  }

  public final void bNK()
  {
  }

  public final void bNL()
  {
  }

  public final void iS(boolean paramBoolean)
  {
  }

  public final void onPause()
  {
    AppMethodBeat.i(22782);
    this.gci.stopTimer();
    this.miP.stopTimer();
    this.miD = -1L;
    this.oos.EH();
    aw.Cc().Ic();
    AppMethodBeat.o(22782);
  }

  public final void release()
  {
    AppMethodBeat.i(22781);
    this.oot.release();
    AppMethodBeat.o(22781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.b
 * JD-Core Version:    0.6.2
 */