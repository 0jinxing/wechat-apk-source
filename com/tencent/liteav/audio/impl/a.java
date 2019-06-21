package com.tencent.liteav.audio.impl;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements e
{
  private final String a;
  private Context b;
  private BroadcastReceiver c;
  private BluetoothProfile.ServiceListener d;
  private BluetoothHeadset e;
  private List<d> f;
  private Handler g;
  private boolean h;
  private int i;
  private AudioManager j;

  static
  {
    AppMethodBeat.i(66583);
    b.e();
    AppMethodBeat.o(66583);
  }

  private a()
  {
    AppMethodBeat.i(66570);
    this.a = ("AudioCenter:" + a.class.getSimpleName());
    this.i = TXEAudioDef.TXE_AUDIO_MODE_SPEAKER;
    this.f = new ArrayList();
    AppMethodBeat.o(66570);
  }

  public static a a()
  {
    AppMethodBeat.i(66569);
    a locala = a.a.a();
    AppMethodBeat.o(66569);
    return locala;
  }

  private void a(BluetoothDevice paramBluetoothDevice)
  {
    AppMethodBeat.i(66574);
    if ((paramBluetoothDevice == null) || (this.e == null))
    {
      AppMethodBeat.o(66574);
      return;
    }
    while (true)
    {
      try
      {
        k = this.e.getConnectionState(paramBluetoothDevice);
        TXCLog.d(this.a, "BluetoothHeadset state：".concat(String.valueOf(k)));
        switch (k)
        {
        case 1:
        default:
          AppMethodBeat.o(66574);
        case 2:
        case 0:
        }
      }
      catch (Exception paramBluetoothDevice)
      {
        TXCLog.e(this.a, "getConnectionState exception: ".concat(String.valueOf(paramBluetoothDevice)));
        int k = 0;
        continue;
        a(true);
        TXCLog.d(this.a, "BluetoothHeadset connect");
        if (!this.j.isBluetoothScoAvailableOffCall())
        {
          TXCLog.e(this.a, "not support BTHeadset sco");
          AppMethodBeat.o(66574);
          break;
        }
        this.j.startBluetoothSco();
        AppMethodBeat.o(66574);
      }
      break;
      a(false);
      TXCLog.d(this.a, "BluetoothHeadset disconnect");
      this.j.setBluetoothScoOn(false);
      this.j.stopBluetoothSco();
      a(this.i);
    }
  }

  private void a(Intent paramIntent)
  {
    AppMethodBeat.i(66572);
    int k = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
    new StringBuilder("Audio SCO state: ").append(k).append(", thread id = ").append(Thread.currentThread().getId());
    if (k == 1)
    {
      TXCLog.i(this.a, "SCO connected, yeah!");
      this.j.setBluetoothScoOn(true);
      a(this.i);
      AppMethodBeat.o(66572);
    }
    while (true)
    {
      return;
      if (k == 2)
      {
        TXCLog.i(this.a, "SCO connecting");
        AppMethodBeat.o(66572);
      }
      else if (k == 0)
      {
        TXCLog.i(this.a, "SCO disconnect");
        if (this.e == null)
          AppMethodBeat.o(66572);
        else
          this.g.postDelayed(new a.3(this), 1000L);
      }
      else
      {
        AppMethodBeat.o(66572);
      }
    }
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(66568);
    TXCTraeJNI.nativeSetTraeConfig(paramString);
    AppMethodBeat.o(66568);
  }

  private void a(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(66578);
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
        ((d)localIterator.next()).OnHeadsetState(paramBoolean);
    }
    finally
    {
    }
    AppMethodBeat.o(66578);
  }

  private void b(Intent paramIntent)
  {
    AppMethodBeat.i(66573);
    int k;
    if (paramIntent.hasExtra("state"))
    {
      k = paramIntent.getIntExtra("state", 0);
      if (k == 0)
      {
        this.h = false;
        a(false);
        a(this.i);
        TXCLog.d(this.a, "pull out wired headset");
        AppMethodBeat.o(66573);
      }
    }
    while (true)
    {
      return;
      if (1 == k)
      {
        this.h = true;
        a(true);
        a(this.i);
        TXCLog.d(this.a, "insert wired headset");
      }
      AppMethodBeat.o(66573);
    }
  }

  public void a(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(66575);
        this.i = paramInt;
        if (this.h)
        {
          this.j.setMode(0);
          this.j.setSpeakerphoneOn(false);
          TXCLog.d(this.a, "setAudioMode, is wiredHeadsetOn, set MODE_NORMAL and speakerphoneOn false");
          AppMethodBeat.o(66575);
          return;
        }
        if ((this.e != null) && (this.j.isBluetoothScoOn()))
        {
          this.j.setMode(3);
          this.j.setSpeakerphoneOn(false);
          TXCLog.d(this.a, "setAudioMode, is bluetoothHeadset connect and isBluetoothScoOn true, set mode MODE_IN_COMMUNICATION and speakerphoneOn false");
          AppMethodBeat.o(66575);
          continue;
        }
      }
      finally
      {
      }
      if (this.j == null)
      {
        AppMethodBeat.o(66575);
      }
      else if (paramInt == TXEAudioDef.TXE_AUDIO_MODE_RECEIVER)
      {
        this.j.setMode(3);
        this.j.setSpeakerphoneOn(false);
        TXCLog.i(this.a, "AudioCenter setAudioMode to receiver, MODE_IN_COMMUNICATION, speakerphoneOn false");
        AppMethodBeat.o(66575);
      }
      else
      {
        this.j.setMode(0);
        this.j.setSpeakerphoneOn(true);
        TXCLog.i(this.a, "AudioCenter setAudioMode to speaker, MODE_NORMAL, speakerphoneOn true");
        AppMethodBeat.o(66575);
      }
    }
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(66571);
    if (this.c != null)
      AppMethodBeat.o(66571);
    while (true)
    {
      return;
      TXCLog.i(this.a, "init");
      this.b = paramContext.getApplicationContext();
      c.a().a(this.b);
      c.a().a(this);
      this.j = ((AudioManager)paramContext.getSystemService("audio"));
      this.g = new Handler(Looper.getMainLooper());
      this.c = new a.1(this);
      this.d = new a.2(this);
      paramContext = new IntentFilter();
      paramContext.addAction("android.intent.action.HEADSET_PLUG");
      paramContext.addAction("android.bluetooth.device.action.ACL_CONNECTED");
      paramContext.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
      paramContext.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      paramContext.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
      this.b.registerReceiver(this.c, paramContext);
      try
      {
        paramContext = BluetoothAdapter.getDefaultAdapter();
        if (paramContext != null)
          paramContext.getProfileProxy(this.b, this.d, 1);
        AppMethodBeat.o(66571);
      }
      catch (Exception paramContext)
      {
        TXCLog.e(this.a, "BluetoothAdapter getProfileProxy: ".concat(String.valueOf(paramContext)));
        AppMethodBeat.o(66571);
      }
    }
  }

  public void a(d paramd)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(66576);
        if (paramd == null)
        {
          AppMethodBeat.o(66576);
          return;
        }
        this.f.add(paramd);
        if (this.h)
        {
          paramd.OnHeadsetState(true);
          AppMethodBeat.o(66576);
          continue;
        }
      }
      finally
      {
      }
      if ((this.e != null) && (this.j != null) && (this.j.isBluetoothScoOn()))
      {
        paramd.OnHeadsetState(true);
        AppMethodBeat.o(66576);
      }
      else
      {
        paramd.OnHeadsetState(false);
        AppMethodBeat.o(66576);
      }
    }
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(66579);
    TXCLog.i(this.a, "onCallStateChanged, state = ".concat(String.valueOf(paramInt)));
    if (!this.j.isBluetoothScoAvailableOffCall())
    {
      TXCLog.e(this.a, "not support BTHeadset sco");
      AppMethodBeat.o(66579);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (this.e != null) && (!this.j.isBluetoothScoOn()))
      {
        TXCLog.i(this.a, "to restartBluetoothSco");
        this.g.postDelayed(new a.4(this), 1000L);
      }
      AppMethodBeat.o(66579);
    }
  }

  public void b(d paramd)
  {
    try
    {
      AppMethodBeat.i(66577);
      if (paramd == null)
        AppMethodBeat.o(66577);
      while (true)
      {
        return;
        this.f.remove(paramd);
        AppMethodBeat.o(66577);
      }
    }
    finally
    {
    }
    throw paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.a
 * JD-Core Version:    0.6.2
 */