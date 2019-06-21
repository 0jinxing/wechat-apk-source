package com.tencent.mm.plugin.emojicapture.ui;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.plugin.emojicapture.model.a.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$UINavigation;", "", "dismissLoading", "", "exit", "success", "", "gifMd5", "", "go2Capture", "onEditorPrepared", "onVoiceFinished", "voiceText", "prepareEditor", "emojiCaptureInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "showLoading", "context", "Landroid/content/Context;", "msg", "", "cancelAble", "style", "", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "plugin-emojicapture_release"})
public abstract interface EmojiCaptureUI$b
{
  public abstract void Kc(String paramString);

  public abstract void a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener);

  public abstract void bnN();

  public abstract void bnO();

  public abstract void bnP();

  public abstract void c(a parama);

  public abstract void k(boolean paramBoolean, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b
 * JD-Core Version:    0.6.2
 */