package com.tencent.mm.plugin.d.a.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(18)
public final class e
{
  public Context Gn;
  public final HashMap<Long, f> jFA;
  public c jFC;
  public c.a jFF;
  e.a jGi;
  public HashSet<Long> jGj;
  final HashMap<Long, Boolean> jGk;
  public f.a jGl;
  public ak mHandler;
  private ReentrantLock mLock;
  public Runnable mRunnable;

  public e(e.a parama)
  {
    AppMethodBeat.i(18412);
    this.Gn = null;
    this.mLock = new ReentrantLock();
    this.mHandler = null;
    this.mRunnable = null;
    this.jFF = new e.1(this);
    this.jGj = new HashSet();
    this.jFA = new HashMap();
    this.jGk = new HashMap();
    this.jGl = new e.2(this);
    this.Gn = ah.getContext();
    this.jGi = parama;
    this.jFC = c.aVy();
    this.mRunnable = new e.3(this);
    this.mHandler = new ak(new al("BluetoothLESimpleManagerThread").oAl.getLooper());
    AppMethodBeat.o(18412);
  }

  public final void Q(Runnable paramRunnable)
  {
    AppMethodBeat.i(18413);
    this.mLock.lock();
    paramRunnable.run();
    this.mLock.unlock();
    AppMethodBeat.o(18413);
  }

  @TargetApi(18)
  public final boolean aVw()
  {
    AppMethodBeat.i(18414);
    boolean bool = this.Gn.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    AppMethodBeat.o(18414);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.e
 * JD-Core Version:    0.6.2
 */