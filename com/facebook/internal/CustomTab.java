package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.b.a;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CustomTab
{
  private Uri uri;

  public CustomTab(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(96613);
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    this.uri = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + paramString, localBundle);
    AppMethodBeat.o(96613);
  }

  public void openCustomTab(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(96614);
    Object localObject = new b.a();
    if (((b.a)localObject).kz != null)
      ((b.a)localObject).mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", ((b.a)localObject).kz);
    if (((b.a)localObject).kB != null)
      ((b.a)localObject).mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", ((b.a)localObject).kB);
    ((b.a)localObject).mIntent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", ((b.a)localObject).kC);
    localObject = new android.support.customtabs.b(((b.a)localObject).mIntent, ((b.a)localObject).kA, (byte)0);
    ((android.support.customtabs.b)localObject).intent.setPackage(paramString);
    ((android.support.customtabs.b)localObject).intent.addFlags(1073741824);
    paramString = this.uri;
    ((android.support.customtabs.b)localObject).intent.setData(paramString);
    android.support.v4.content.b.startActivity(paramActivity, ((android.support.customtabs.b)localObject).intent, ((android.support.customtabs.b)localObject).ky);
    AppMethodBeat.o(96614);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.CustomTab
 * JD-Core Version:    0.6.2
 */