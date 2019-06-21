package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.f.a.a.a;
import com.tencent.f.a.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

class be
{
  private static be e = null;
  bh a;
  Context b;
  b c;
  a d;

  private be(Context paramContext)
  {
    AppMethodBeat.i(64624);
    this.a = null;
    this.b = paramContext.getApplicationContext();
    this.a = new bh(this.b);
    AppMethodBeat.o(64624);
  }

  public static be a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64623);
      if (e == null)
      {
        be localbe = new com/tencent/smtt/sdk/be;
        localbe.<init>(paramContext);
        e = localbe;
      }
      paramContext = e;
      AppMethodBeat.o(64623);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  void a(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(64626);
    this.a.a(paramActivity, paramInt);
    AppMethodBeat.o(64626);
  }

  public boolean a()
  {
    AppMethodBeat.i(64627);
    this.a.a();
    boolean bool = this.a.b();
    AppMethodBeat.o(64627);
    return bool;
  }

  public boolean a(String paramString, Bundle paramBundle, b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(64625);
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    if (!TextUtils.isEmpty(paramString))
      localBundle.putString("videoUrl", paramString);
    if (paramb != null)
    {
      this.a.a();
      if (!this.a.b())
      {
        bool = false;
        AppMethodBeat.o(64625);
        return bool;
      }
      this.c = paramb;
      this.d = new bf(this);
      localBundle.putInt("callMode", 3);
    }
    while (true)
    {
      paramBundle = this.a;
      paramString = this;
      if (paramb == null)
        paramString = null;
      paramBundle.a(localBundle, paramString);
      AppMethodBeat.o(64625);
      break;
      localBundle.putInt("callMode", 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.be
 * JD-Core Version:    0.6.2
 */