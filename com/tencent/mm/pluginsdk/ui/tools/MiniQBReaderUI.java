package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.xweb.x5.sdk.d;

@a(3)
public class MiniQBReaderUI extends MMActivity
{
  private int ret;
  private String vuT;

  public MiniQBReaderUI()
  {
    AppMethodBeat.i(28171);
    this.ret = -1;
    this.vuT = Integer.toString(hashCode());
    AppMethodBeat.o(28171);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(28172);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.MiniQBReaderUI", "onCreate");
    Object localObject1 = getIntent();
    paramBundle = ((Intent)localObject1).getStringExtra("file_path");
    localObject1 = ((Intent)localObject1).getStringExtra("file_ext");
    Object localObject2 = new MiniQBReaderUI.1(this);
    this.ret = p.a(this, paramBundle, (String)localObject1, this.vuT, (ValueCallback)localObject2);
    ab.i("MicroMsg.MiniQBReaderUI", "tryOpenByQbSdk , ret:%b", new Object[] { Integer.valueOf(this.ret) });
    new StringBuilder("tryOpenByQbSdk , ret:").append(this.ret);
    localObject2 = new Intent();
    ((Intent)localObject2).setAction("MINIQB_OPEN_RET");
    ((Intent)localObject2).putExtra("file_path", paramBundle);
    ((Intent)localObject2).putExtra("file_ext", (String)localObject1);
    if (this.ret == 0);
    while (true)
    {
      ((Intent)localObject2).putExtra("MINIQB_OPEN_RET_VAL", bool);
      sendBroadcast((Intent)localObject2, "com.tencent.mm.permission.MM_MESSAGE");
      if (this.ret != 0)
        finish();
      AppMethodBeat.o(28172);
      return;
      bool = false;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(28174);
    ab.i("MicroMsg.MiniQBReaderUI", "onDestroy");
    if (this.ret == 0);
    try
    {
      d.closeFileReader(this);
      super.onDestroy();
      AppMethodBeat.o(28174);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MiniQBReaderUI", localException, "", new Object[0]);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(28173);
    super.onNewIntent(paramIntent);
    ab.i("MicroMsg.MiniQBReaderUI", "onNewIntent");
    AppMethodBeat.o(28173);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI
 * JD-Core Version:    0.6.2
 */