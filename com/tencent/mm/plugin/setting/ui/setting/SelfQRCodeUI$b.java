package com.tencent.mm.plugin.setting.ui.setting;

import android.net.Uri;
import android.os.FileObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public final class SelfQRCodeUI$b extends FileObserver
{
  private MMActivity qlB;
  private String qlC;

  public SelfQRCodeUI$b(SelfQRCodeUI paramSelfQRCodeUI, MMActivity paramMMActivity)
  {
    super(SelfQRCodeUI.access$700(), 8);
    AppMethodBeat.i(127023);
    this.qlB = paramMMActivity;
    AppMethodBeat.o(127023);
  }

  public final void onEvent(int paramInt, String paramString)
  {
    AppMethodBeat.i(127024);
    if ((paramString != null) && (paramInt == 8) && ((this.qlC == null) || (!paramString.equalsIgnoreCase(this.qlC))))
    {
      this.qlC = paramString;
      Uri.fromFile(new File(SelfQRCodeUI.access$700() + paramString));
      SelfQRCodeUI.cix();
      ab.i("MicroMsg.SelfQRCodeNewUI$ScreenshotObserver", "Send event to listener.");
    }
    AppMethodBeat.o(127024);
  }

  public final void start()
  {
    AppMethodBeat.i(127025);
    super.startWatching();
    AppMethodBeat.o(127025);
  }

  public final void stop()
  {
    AppMethodBeat.i(127026);
    super.stopWatching();
    AppMethodBeat.o(127026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.b
 * JD-Core Version:    0.6.2
 */