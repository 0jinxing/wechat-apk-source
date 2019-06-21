package com.tencent.mm.performance.wxperformancetool;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.b;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;

@TargetApi(17)
public class MemoryLeakActivity extends Activity
{
  private AlertDialog ggr;
  private ak mHandler;
  private String mKey;

  public MemoryLeakActivity()
  {
    AppMethodBeat.i(76886);
    this.mHandler = new MemoryLeakActivity.1(this);
    AppMethodBeat.o(76886);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(76887);
    super.onCreate(paramBundle);
    setContentView(2130968794);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("memory leak");
    this.mKey = getIntent().getStringExtra("key");
    String str1 = getIntent().getStringExtra("tag");
    String str2 = getIntent().getStringExtra("class");
    paramBundle = str2;
    if (str2.contains(" "))
      paramBundle = str2.substring(str2.indexOf(" "));
    str2 = paramBundle.replace(".", "_");
    localBuilder.setMessage(str1 + paramBundle + "\n\npath:" + b.ydz + str2 + ".zip");
    localBuilder.setCancelable(true);
    localBuilder.setPositiveButton("dumphprof", new MemoryLeakActivity.2(this, str2));
    localBuilder.setNegativeButton("cancel", new MemoryLeakActivity.3(this));
    localBuilder.setOnDismissListener(new MemoryLeakActivity.4(this));
    this.ggr = localBuilder.create();
    b.dvS();
    this.mHandler.sendEmptyMessageDelayed(0, 200L);
    AppMethodBeat.o(76887);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(76888);
    super.onDestroy();
    a.ggu.remove(this.mKey);
    this.mHandler.removeCallbacksAndMessages(null);
    if ((this.ggr != null) && (this.ggr.isShowing()))
    {
      this.ggr.dismiss();
      this.ggr = null;
    }
    AppMethodBeat.o(76888);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.performance.wxperformancetool.MemoryLeakActivity
 * JD-Core Version:    0.6.2
 */