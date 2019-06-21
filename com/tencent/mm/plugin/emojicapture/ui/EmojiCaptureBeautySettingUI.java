package com.tencent.mm.plugin.emojicapture.ui;

import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureBeautySettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "chinInputText", "Landroid/widget/EditText;", "eyeInputText", "faceVInputText", "noseInputText", "shapeInputText", "skinInputText", "clamp", "", "value", "min", "max", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "saveParam", "plugin-emojicapture_release"})
public final class EmojiCaptureBeautySettingUI extends MMActivity
{
  private EditText lkU;
  private EditText lkV;
  private EditText lkW;
  private EditText lkX;
  private EditText lkY;
  private EditText lkZ;

  private static int dW(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2859);
    paramInt1 = Math.min(100, Math.max(paramInt2, paramInt1));
    AppMethodBeat.o(2859);
    return paramInt1;
  }

  public final int getLayoutId()
  {
    return 2130969322;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(2857);
    super.onCreate(paramBundle);
    setBackBtn((MenuItem.OnMenuItemClickListener)new EmojiCaptureBeautySettingUI.a(this));
    paramBundle = findViewById(2131823411);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.widget.EditText");
      AppMethodBeat.o(2857);
      throw paramBundle;
    }
    this.lkU = ((EditText)paramBundle);
    paramBundle = findViewById(2131823412);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.widget.EditText");
      AppMethodBeat.o(2857);
      throw paramBundle;
    }
    this.lkV = ((EditText)paramBundle);
    paramBundle = findViewById(2131823413);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.widget.EditText");
      AppMethodBeat.o(2857);
      throw paramBundle;
    }
    this.lkW = ((EditText)paramBundle);
    paramBundle = findViewById(2131823414);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.widget.EditText");
      AppMethodBeat.o(2857);
      throw paramBundle;
    }
    this.lkX = ((EditText)paramBundle);
    paramBundle = findViewById(2131823415);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.widget.EditText");
      AppMethodBeat.o(2857);
      throw paramBundle;
    }
    this.lkY = ((EditText)paramBundle);
    paramBundle = findViewById(2131823416);
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.widget.EditText");
      AppMethodBeat.o(2857);
      throw paramBundle;
    }
    this.lkZ = ((EditText)paramBundle);
    paramBundle = ah.getContext().getSharedPreferences("EmojiCaptureDebugBeautyPara", 0);
    int i = paramBundle.getInt("skin", 50);
    int j = paramBundle.getInt("shape", 20);
    int k = paramBundle.getInt("faceV", 0);
    int m = paramBundle.getInt("eye", 0);
    int n = paramBundle.getInt("nose", 0);
    int i1 = paramBundle.getInt("chin", 0);
    paramBundle = this.lkU;
    if (paramBundle == null)
      a.f.b.j.avw("skinInputText");
    paramBundle.setText((CharSequence)String.valueOf(i));
    paramBundle = this.lkV;
    if (paramBundle == null)
      a.f.b.j.avw("shapeInputText");
    paramBundle.setText((CharSequence)String.valueOf(j));
    paramBundle = this.lkW;
    if (paramBundle == null)
      a.f.b.j.avw("faceVInputText");
    paramBundle.setText((CharSequence)String.valueOf(k));
    paramBundle = this.lkX;
    if (paramBundle == null)
      a.f.b.j.avw("eyeInputText");
    paramBundle.setText((CharSequence)String.valueOf(m));
    paramBundle = this.lkY;
    if (paramBundle == null)
      a.f.b.j.avw("noseInputText");
    paramBundle.setText((CharSequence)String.valueOf(n));
    paramBundle = this.lkZ;
    if (paramBundle == null)
      a.f.b.j.avw("chinInputText");
    paramBundle.setText((CharSequence)String.valueOf(i1));
    AppMethodBeat.o(2857);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(2858);
    super.onDestroy();
    Object localObject = this.lkU;
    if (localObject == null)
      a.f.b.j.avw("skinInputText");
    int i = com.tencent.mm.c.j.getInt(((EditText)localObject).getText().toString(), -1);
    localObject = this.lkV;
    if (localObject == null)
      a.f.b.j.avw("shapeInputText");
    int j = com.tencent.mm.c.j.getInt(((EditText)localObject).getText().toString(), -1);
    localObject = this.lkW;
    if (localObject == null)
      a.f.b.j.avw("faceVInputText");
    int k = com.tencent.mm.c.j.getInt(((EditText)localObject).getText().toString(), -1);
    localObject = this.lkX;
    if (localObject == null)
      a.f.b.j.avw("eyeInputText");
    int m = com.tencent.mm.c.j.getInt(((EditText)localObject).getText().toString(), -1);
    localObject = this.lkY;
    if (localObject == null)
      a.f.b.j.avw("noseInputText");
    int n = com.tencent.mm.c.j.getInt(((EditText)localObject).getText().toString(), -1);
    localObject = this.lkZ;
    if (localObject == null)
      a.f.b.j.avw("chinInputText");
    int i1 = com.tencent.mm.c.j.getInt(((EditText)localObject).getText().toString(), -1);
    localObject = ah.getContext().getSharedPreferences("EmojiCaptureDebugBeautyPara", 0).edit();
    ((SharedPreferences.Editor)localObject).putInt("skin", dW(i, 0));
    ((SharedPreferences.Editor)localObject).putInt("shape", dW(j, 0));
    ((SharedPreferences.Editor)localObject).putInt("faceV", dW(k, 0));
    ((SharedPreferences.Editor)localObject).putInt("eye", dW(m, 0));
    ((SharedPreferences.Editor)localObject).putInt("nose", dW(n, 0));
    ((SharedPreferences.Editor)localObject).putInt("chin", dW(i1, -100));
    ((SharedPreferences.Editor)localObject).commit();
    AppMethodBeat.o(2858);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureBeautySettingUI
 * JD-Core Version:    0.6.2
 */