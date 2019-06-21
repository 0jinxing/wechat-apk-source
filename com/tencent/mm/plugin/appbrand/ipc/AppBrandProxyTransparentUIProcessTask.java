package com.tencent.mm.plugin.appbrand.ipc;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AppBrandProxyTransparentUIProcessTask
  implements Parcelable
{
  private static Map<String, WeakReference<AppBrandProxyTransparentUIProcessTask>> huK = new ConcurrentHashMap();
  private static final Set<Object> hvo = new HashSet();
  private int hvp = -1;
  private MMActivity.a hvq = new MMActivity.a()
  {
    public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
    {
      AppMethodBeat.i(73150);
      if (paramAnonymousInt1 == (AppBrandProxyTransparentUIProcessTask.this.hashCode() & 0xFFFF))
        if (paramAnonymousIntent == null)
          AppMethodBeat.o(73150);
      while (true)
      {
        return;
        AppBrandProxyTransparentUIProcessTask localAppBrandProxyTransparentUIProcessTask = (AppBrandProxyTransparentUIProcessTask)paramAnonymousIntent.getParcelableExtra("task_object");
        paramAnonymousIntent = AppBrandProxyTransparentUIProcessTask.AF(paramAnonymousIntent.getStringExtra("task_id"));
        if (paramAnonymousIntent == null)
        {
          ab.e("MicroMsg.AppBrandProxyTransparentUIProcessTask", "task is null");
          AppMethodBeat.o(73150);
        }
        else
        {
          AppBrandProxyTransparentUIProcessTask.a(localAppBrandProxyTransparentUIProcessTask, paramAnonymousIntent);
          paramAnonymousIntent.aBW();
          paramAnonymousIntent.asQ();
          AppBrandProxyTransparentUIProcessTask.this.mContext = null;
          AppMethodBeat.o(73150);
        }
      }
    }
  };
  private String hvr = Process.myPid() + hashCode();
  Context mContext;

  protected AppBrandProxyTransparentUIProcessTask()
  {
  }

  public AppBrandProxyTransparentUIProcessTask(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public abstract void a(Context paramContext, AppBrandProxyTransparentUIProcessTask.a parama);

  public final void aBU()
  {
    if (this.mContext == null);
    while (true)
    {
      return;
      huK.put(this.hvr, new WeakReference(this));
      Intent localIntent = new Intent();
      localIntent.setClass(this.mContext, AppBrandProxyTransparentUI.class);
      localIntent.putExtra("task_object", this);
      localIntent.putExtra("task_class_name", getClass().getName());
      localIntent.putExtra("task_id", this.hvr);
      localIntent.putExtra("orientation", this.hvp);
      if ((this.mContext instanceof MMActivity))
      {
        aBV();
        ((MMActivity)this.mContext).ifE = this.hvq;
        ((MMActivity)this.mContext).startActivityForResult(localIntent, hashCode() & 0xFFFF);
      }
      else
      {
        localIntent.addFlags(268435456);
        this.mContext.startActivity(localIntent);
      }
    }
  }

  public final void aBV()
  {
    hvo.add(this);
  }

  public final void aBW()
  {
    hvo.remove(this);
  }

  public void asQ()
  {
  }

  public int describeContents()
  {
    return 0;
  }

  public void g(Parcel paramParcel)
  {
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
 * JD-Core Version:    0.6.2
 */