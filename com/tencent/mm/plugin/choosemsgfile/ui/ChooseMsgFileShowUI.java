package com.tencent.mm.plugin.choosemsgfile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.xweb.x5.sdk.d;
import org.json.JSONException;
import org.json.JSONObject;

@a(3)
public class ChooseMsgFileShowUI extends MMActivity
{
  private int kvD;

  private void dy(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54435);
    Intent localIntent = new Intent();
    localIntent.setAction("MINIQB_OPEN_RET");
    localIntent.putExtra("file_path", paramString1);
    localIntent.putExtra("file_ext", paramString2);
    ab.i("MicroMsg.ChooseMsgFileShowUI", "TBS MiniQB cannot open this file:%s", new Object[] { paramString1 });
    localIntent.putExtra("MINIQB_OPEN_RET_VAL", false);
    sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    finish();
    AppMethodBeat.o(54435);
  }

  public static void q(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(54437);
    Intent localIntent = new Intent(paramContext, ChooseMsgFileShowUI.class);
    localIntent.putExtra("key_filepath", paramString1);
    localIntent.putExtra("key_fileext", paramString2);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(54437);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(54434);
    super.onCreate(paramBundle);
    String str1 = getIntent().getStringExtra("key_filepath");
    String str2 = getIntent().getStringExtra("key_fileext");
    paramBundle = "";
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      ((JSONObject)localObject).putOpt("path", str1);
      ((JSONObject)localObject).putOpt("ext", str2);
      localObject = ((JSONObject)localObject).toString();
      paramBundle = (Bundle)localObject;
      d.a(this, paramBundle, new ChooseMsgFileShowUI.1(this, str1, str2));
      AppMethodBeat.o(54434);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ChooseMsgFileShowUI", localJSONException, "", new Object[0]);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54436);
    if (this.kvD == 0);
    try
    {
      d.closeFileReader(this);
      super.onDestroy();
      AppMethodBeat.o(54436);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ChooseMsgFileShowUI", localException, "", new Object[0]);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI
 * JD-Core Version:    0.6.2
 */