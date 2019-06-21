package com.tencent.xweb.xwalk;

import android.content.Context;
import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.a.a;
import com.tencent.xweb.n;
import java.util.Map;
import org.xwalk.core.XWalkDownloadListener;
import org.xwalk.core.XWalkGeolocationPermissionsCallback;
import org.xwalk.core.XWalkWebResourceRequest;

public final class f
{
  public static final class b
    implements GeolocationPermissions.Callback
  {
    XWalkGeolocationPermissionsCallback ARU;

    public b(XWalkGeolocationPermissionsCallback paramXWalkGeolocationPermissionsCallback)
    {
      this.ARU = paramXWalkGeolocationPermissionsCallback;
    }

    public final void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      AppMethodBeat.i(85218);
      if (this.ARU != null)
        this.ARU.invoke(paramString, paramBoolean1, paramBoolean2);
      AppMethodBeat.o(85218);
    }
  }

  public static final class e extends XWalkDownloadListener
  {
    DownloadListener AQl;

    public e(Context paramContext, DownloadListener paramDownloadListener)
    {
      super();
      this.AQl = paramDownloadListener;
    }

    public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
    {
      AppMethodBeat.i(85225);
      if (this.AQl != null)
        this.AQl.onDownloadStart(paramString1, paramString2, paramString3, paramString4, paramLong);
      AppMethodBeat.o(85225);
    }
  }

  public static final class h
    implements n
  {
    private boolean APL;
    private boolean APM;
    a APN;
    private String method;
    private Uri url;
    private Map<String, String> vfl;

    public h(XWalkWebResourceRequest paramXWalkWebResourceRequest)
    {
      AppMethodBeat.i(85229);
      this.url = paramXWalkWebResourceRequest.getUrl();
      this.APL = paramXWalkWebResourceRequest.isForMainFrame();
      this.APM = paramXWalkWebResourceRequest.hasGesture();
      this.method = paramXWalkWebResourceRequest.getMethod();
      this.vfl = paramXWalkWebResourceRequest.getRequestHeaders();
      this.APN = new a(this);
      AppMethodBeat.o(85229);
    }

    public final String getMethod()
    {
      return this.method;
    }

    public final Map<String, String> getRequestHeaders()
    {
      return this.vfl;
    }

    public final Uri getUrl()
    {
      return this.url;
    }

    public final boolean hasGesture()
    {
      return this.APM;
    }

    public final boolean isForMainFrame()
    {
      return this.APL;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.f
 * JD-Core Version:    0.6.2
 */