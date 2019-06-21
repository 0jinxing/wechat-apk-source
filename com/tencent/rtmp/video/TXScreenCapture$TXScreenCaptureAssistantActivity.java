package com.tencent.rtmp.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TXScreenCapture$TXScreenCaptureAssistantActivity extends Activity
{
  @TargetApi(21)
  public void Start()
  {
    AppMethodBeat.i(65589);
    Intent localIntent1 = (Intent)getIntent().getParcelableExtra("TXScreenCapture.ScreenCaptureIntent");
    try
    {
      startActivityForResult(localIntent1, 1001);
      AppMethodBeat.o(65589);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Intent localIntent2 = new Intent("TXScreenCapture.OnAssistantActivityResult");
        localIntent2.putExtra("TXScreenCapture.RequestCode", 1001);
        localIntent2.putExtra("TXScreenCapture.ResultCode", 20000002);
        sendBroadcast(localIntent2);
        finish();
        AppMethodBeat.o(65589);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(65590);
    Intent localIntent = new Intent("TXScreenCapture.OnAssistantActivityResult");
    localIntent.putExtra("TXScreenCapture.RequestCode", paramInt1);
    localIntent.putExtra("TXScreenCapture.ResultCode", paramInt2);
    localIntent.putExtra("TXScreenCapture.ResultData", paramIntent);
    sendBroadcast(localIntent);
    finish();
    AppMethodBeat.o(65590);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(65588);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    Start();
    AppMethodBeat.o(65588);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.video.TXScreenCapture.TXScreenCaptureAssistantActivity
 * JD-Core Version:    0.6.2
 */