package com.tencent.mm.plugin.emojicapture.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.a.a;
import com.tencent.mm.plugin.emojicapture.c.b.a;
import com.tencent.mm.plugin.emojicapture.model.a.a;
import com.tencent.mm.plugin.emojicapture.model.d;
import com.tencent.mm.plugin.emojicapture.model.e;
import com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer;
import com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$uiNavigation$1", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$UINavigation;", "loading", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "dismissLoading", "", "exit", "success", "", "gifMd5", "", "go2Capture", "onEditorPrepared", "onVoiceFinished", "voiceText", "prepareEditor", "emojiCaptureInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "showLoading", "context", "Landroid/content/Context;", "msg", "", "cancelAble", "style", "", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "plugin-emojicapture_release"})
public final class EmojiCaptureUI$f
  implements EmojiCaptureUI.b
{
  private p llm;

  public final void Kc(String paramString)
  {
    AppMethodBeat.i(2872);
    b.a locala = EmojiCaptureUI.d(this.llk);
    if (locala != null)
    {
      locala.JZ(paramString);
      AppMethodBeat.o(2872);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2872);
    }
  }

  public final void a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(2873);
    j.p(paramContext, "context");
    j.p(paramCharSequence, "msg");
    p localp = this.llm;
    if (localp != null)
      localp.dismiss();
    this.llm = p.b(paramContext, paramCharSequence, paramBoolean, paramOnCancelListener);
    ab.i(EmojiCaptureUI.a(this.llk), "showLoading: " + this.llm);
    AppMethodBeat.o(2873);
  }

  public final void bnN()
  {
    AppMethodBeat.i(2870);
    ab.i(EmojiCaptureUI.a(this.llk), "go2Capture");
    EmojiCaptureUI.g(this.llk).setVisibility(0);
    EmojiCaptureUI.c(this.llk).setVisibility(8);
    EmojiCaptureUI.g(this.llk).onResume();
    EmojiCaptureUI.a(this.llk, 0);
    AppMethodBeat.o(2870);
  }

  public final void bnO()
  {
    AppMethodBeat.i(2871);
    ab.i(EmojiCaptureUI.a(this.llk), "onEditorPrepared");
    if (EmojiCaptureUI.f(this.llk) == 2)
    {
      EmojiCaptureUI.c(this.llk).setAlpha(1.0F);
      EmojiCaptureUI.g(this.llk).setVisibility(8);
      bnP();
      EmojiCaptureUI.a(this.llk, 1);
    }
    AppMethodBeat.o(2871);
  }

  public final void bnP()
  {
    AppMethodBeat.i(2874);
    p localp = this.llm;
    if (localp != null)
      localp.dismiss();
    ab.i(EmojiCaptureUI.a(this.llk), "dismissLoading: " + this.llm);
    AppMethodBeat.o(2874);
  }

  public final void c(a parama)
  {
    AppMethodBeat.i(2869);
    j.p(parama, "emojiCaptureInfo");
    ab.i(EmojiCaptureUI.a(this.llk), "prepareEditor " + parama.videoPath);
    Object localObject = e.lhA;
    if (!e.Kb(parama.videoPath))
    {
      EmojiCaptureReporter.up(2);
      parama = d.lhz;
      d.bmV();
      AppMethodBeat.o(2869);
    }
    while (true)
    {
      return;
      EmojiCaptureUI.c(this.llk).setVisibility(0);
      EmojiCaptureUI.c(this.llk).setAlpha(0.0F);
      localObject = EmojiCaptureUI.d(this.llk);
      if (localObject != null)
        ((b.a)localObject).b(parama);
      parama = EmojiCaptureUI.e(this.llk);
      if (parama != null)
        parama.pk();
      EmojiCaptureUI.a(this.llk, 2);
      AppMethodBeat.o(2869);
    }
  }

  public final void k(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(2875);
    Intent localIntent = new Intent();
    if (paramBoolean)
    {
      localIntent.putExtra("key_enter_time", EmojiCaptureUI.h(this.llk));
      localIntent.putExtra("gif_md5", paramString);
      this.llk.setResult(-1, localIntent);
    }
    while (true)
    {
      this.llk.finish();
      AppMethodBeat.o(2875);
      return;
      EmojiCaptureUI.i(this.llk).ckF = (System.currentTimeMillis() - EmojiCaptureUI.i(this.llk).ezZ);
      EmojiCaptureReporter.a(6, EmojiCaptureUI.i(this.llk).ezZ, EmojiCaptureUI.i(this.llk).ckF, 0L, 0L, 0L, 0L, 0, 0, EmojiCaptureUI.i(this.llk).scene);
      this.llk.setResult(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.f
 * JD-Core Version:    0.6.2
 */