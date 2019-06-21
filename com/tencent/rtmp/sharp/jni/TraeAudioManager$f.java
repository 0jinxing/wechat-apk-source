package com.tencent.rtmp.sharp.jni;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;

class TraeAudioManager$f extends Thread
{
  Handler a;
  TraeMediaPlayer b;
  long c;
  String d;
  String e;
  final boolean[] f;
  boolean g;
  TraeAudioManager h;
  String i;
  int j;
  int k;
  long l;
  String m;
  AudioManager.OnAudioFocusChangeListener n;
  int o;

  public TraeAudioManager$f(TraeAudioManager arg1, TraeAudioManager paramTraeAudioManager2)
  {
    AppMethodBeat.i(65674);
    this.a = null;
    this.b = null;
    this.c = -1L;
    this.d = "";
    this.e = "";
    this.f = new boolean[] { false };
    this.g = false;
    this.h = null;
    this.i = "";
    this.j = 0;
    this.k = 0;
    this.l = -1L;
    this.m = "";
    this.n = null;
    this.o = 0;
    this.h = paramTraeAudioManager2;
    long l1 = SystemClock.elapsedRealtime();
    if (QLog.isColorLevel())
      QLog.e("TRAE", 2, "TraeAudioManagerLooper start...");
    start();
    synchronized (this.f)
    {
      int i1 = this.f[0];
      if (i1 != 0);
    }
    try
    {
      this.f.wait();
      label157: if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "  start used:" + (SystemClock.elapsedRealtime() - l1) + "ms");
      AppMethodBeat.o(65674);
      return;
      paramTraeAudioManager2 = finally;
      AppMethodBeat.o(65674);
      throw paramTraeAudioManager2;
    }
    catch (InterruptedException paramTraeAudioManager2)
    {
      break label157;
    }
  }

  public int a(int paramInt, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65676);
    if (this.a == null)
    {
      StringBuilder localStringBuilder = new StringBuilder(" fail mMsgHandler==null _enabled:");
      if (this.g)
      {
        paramHashMap = "Y";
        AudioDeviceInterface.LogTraceEntry(paramHashMap + " activeMode:" + this.p._activeMode + " msg:" + paramInt);
        AppMethodBeat.o(65676);
        paramInt = -1;
      }
    }
    while (true)
    {
      return paramInt;
      paramHashMap = "N";
      break;
      paramHashMap = Message.obtain(this.a, paramInt, paramHashMap);
      if (this.a.sendMessage(paramHashMap))
      {
        paramInt = 0;
        AppMethodBeat.o(65676);
      }
      else
      {
        AppMethodBeat.o(65676);
        paramInt = -1;
      }
    }
  }

  int a(boolean paramBoolean)
  {
    AppMethodBeat.i(65679);
    int i1;
    if (this.p._context == null)
    {
      i1 = -1;
      AppMethodBeat.o(65679);
    }
    while (true)
    {
      return i1;
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
      localIntent.putExtra("PARAM_OPERATION", "NOTIFY_SERVICE_STATE");
      localIntent.putExtra("NOTIFY_SERVICE_STATE_DATE", paramBoolean);
      if (this.p._context != null)
        this.p._context.sendBroadcast(localIntent);
      i1 = 0;
      AppMethodBeat.o(65679);
    }
  }

  public void a()
  {
    AppMethodBeat.i(65675);
    AudioDeviceInterface.LogTraceEntry("");
    if (this.a == null)
      AppMethodBeat.o(65675);
    while (true)
    {
      return;
      long l1 = SystemClock.elapsedRealtime();
      this.a.getLooper().quit();
      synchronized (this.f)
      {
        int i1 = this.f[0];
        if (i1 != 1);
      }
      try
      {
        this.f.wait(10000L);
        label68: if (QLog.isColorLevel())
          QLog.e("TRAE", 2, "  quit used:" + (SystemClock.elapsedRealtime() - l1) + "ms");
        this.a = null;
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65675);
        continue;
        localObject = finally;
        AppMethodBeat.o(65675);
        throw localObject;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label68;
      }
    }
  }

  @TargetApi(8)
  void a(int paramInt)
  {
    AppMethodBeat.i(65686);
    if (Build.VERSION.SDK_INT <= 8)
      AppMethodBeat.o(65686);
    while (true)
    {
      return;
      if (this.n == null)
      {
        this.n = new TraeAudioManager.f.3(this);
        if (this.p._am != null)
        {
          int i1 = this.p._am.requestAudioFocus(this.n, paramInt, 1);
          if ((i1 != 1) && (QLog.isColorLevel()))
            QLog.e("TRAE", 2, "request audio focus fail. " + i1 + " mode:" + this.p._am.getMode());
          this.o = paramInt;
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "-------requestAudioFocus _focusSteamType:" + this.o);
        }
      }
      AppMethodBeat.o(65686);
    }
  }

  void a(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65677);
    String str = (String)paramHashMap.get("EXTRA_DATA_DEVICECONFIG");
    TXCLog.w("TRAE", "startService cfg:".concat(String.valueOf(str)));
    StringBuilder localStringBuilder = new StringBuilder(" _enabled:");
    if (this.g)
    {
      paramHashMap = "Y";
      AudioDeviceInterface.LogTraceEntry(paramHashMap + " activeMode:" + this.p._activeMode + " cfg:" + str);
      if (this.p._context != null)
        break label112;
      AppMethodBeat.o(65677);
    }
    while (true)
    {
      return;
      paramHashMap = "N";
      break;
      label112: QLog.w("TRAE", 2, "   startService:".concat(String.valueOf(str)));
      if (((this.g) && (this.i.equals(str))) || (this.p._activeMode != 0))
      {
        AppMethodBeat.o(65677);
      }
      else
      {
        if (this.g)
          b();
        d();
        this.p._context.getSystemService("audio");
        this.p._deviceConfigManager.a();
        this.p._deviceConfigManager.a(str);
        this.i = str;
        if (this.p._am != null)
          this.j = this.p._am.getMode();
        this.g = true;
        if (this.b == null)
          this.b = new TraeMediaPlayer(this.p._context, new TraeAudioManager.f.1(this));
        a(this.g);
        this.p.updateDeviceStatus();
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65677);
      }
    }
  }

  int b(int paramInt)
  {
    AppMethodBeat.i(65694);
    if (this.p._context == null)
    {
      paramInt = -1;
      AppMethodBeat.o(65694);
    }
    while (true)
    {
      return paramInt;
      new Handler(Looper.getMainLooper()).post(new TraeAudioManager.f.4(this, paramInt));
      paramInt = 0;
      AppMethodBeat.o(65694);
    }
  }

  int b(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65685);
    Intent localIntent = new Intent();
    Object localObject = this.p._deviceConfigManager.j();
    ArrayList localArrayList = (ArrayList)((HashMap)localObject).get("EXTRA_DATA_AVAILABLEDEVICE_LIST");
    String str = (String)((HashMap)localObject).get("EXTRA_DATA_CONNECTEDDEVICE");
    localObject = (String)((HashMap)localObject).get("EXTRA_DATA_PREV_CONNECTEDDEVICE");
    localIntent.putExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST", (String[])localArrayList.toArray(new String[0]));
    localIntent.putExtra("EXTRA_DATA_CONNECTEDDEVICE", str);
    localIntent.putExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE", (String)localObject);
    localIntent.putExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME", this.p._deviceConfigManager.d());
    this.p.sendResBroadcast(localIntent, paramHashMap, 0);
    AppMethodBeat.o(65685);
    return 0;
  }

  void b()
  {
    AppMethodBeat.i(65678);
    StringBuilder localStringBuilder = new StringBuilder(" _enabled:");
    String str;
    if (this.g)
    {
      str = "Y";
      AudioDeviceInterface.LogTraceEntry(str + " activeMode:" + this.p._activeMode);
      if (this.g)
        break label73;
      AppMethodBeat.o(65678);
    }
    while (true)
    {
      return;
      str = "N";
      break;
      label73: if (this.p._activeMode == 1)
      {
        h();
        label89: if (this.p._switchThread != null)
        {
          if (QLog.isColorLevel())
            QLog.w("TRAE", 2, "_switchThread:" + this.p._switchThread.b());
          this.p._switchThread.f();
          this.p._switchThread = null;
        }
        if (this.b != null)
          this.b.stopRing();
        this.b = null;
        this.g = false;
        a(this.g);
        if ((this.p._am == null) || (this.p._context == null));
      }
      try
      {
        this.p.InternalSetMode(0);
        label216: e();
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65678);
        continue;
        if (this.p._activeMode != 2)
          break label89;
        i();
      }
      catch (Exception localException)
      {
        break label216;
      }
    }
  }

  int c(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65688);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode);
    int i1;
    if (paramHashMap == null)
    {
      AppMethodBeat.o(65688);
      i1 = -1;
    }
    while (true)
    {
      return i1;
      if (this.p._am == null)
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " InternalVoicecallPreprocess am==null!!");
        AppMethodBeat.o(65688);
        i1 = -1;
      }
      else
      {
        if (this.p._activeMode != 1)
          break;
        localObject = new Intent();
        this.p.sendResBroadcast((Intent)localObject, paramHashMap, 2);
        AppMethodBeat.o(65688);
        i1 = -1;
      }
    }
    this.l = ((Long)paramHashMap.get("PARAM_SESSIONID")).longValue();
    this.m = ((String)paramHashMap.get("PARAM_OPERATION"));
    this.p._activeMode = 1;
    this.p._prevMode = this.p._am.getMode();
    Object localObject = (Integer)paramHashMap.get("PARAM_MODEPOLICY");
    if (localObject == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " params.get(PARAM_MODEPOLICY)==null!!");
      this.p._modePolicy = -1;
      label215: if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "  _modePolicy:" + this.p._modePolicy);
      localObject = (Integer)paramHashMap.get("PARAM_STREAMTYPE");
      if (localObject != null)
        break label401;
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " params.get(PARAM_STREAMTYPE)==null!!");
      this.p._streamType = 0;
      label288: if ((!TraeAudioManager.isCloseSystemAPM(this.p._modePolicy)) || (this.p._activeMode == 2) || (this.p._deviceConfigManager == null))
        break label431;
      if (!this.p._deviceConfigManager.h().equals("DEVICE_SPEAKERPHONE"))
        break label415;
      this.p.InternalSetMode(0);
      a(3);
    }
    while (true)
    {
      localObject = new Intent();
      this.p.sendResBroadcast((Intent)localObject, paramHashMap, 0);
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65688);
      i1 = 0;
      break;
      this.p._modePolicy = ((Integer)localObject).intValue();
      break label215;
      label401: this.p._streamType = ((Integer)localObject).intValue();
      break label288;
      label415: this.p.InternalSetMode(3);
      a(0);
      continue;
      label431: this.p.InternalSetMode(TraeAudioManager.getCallAudioMode(this.p._modePolicy));
      a(this.p._streamType);
    }
  }

  void c()
  {
    AppMethodBeat.i(65681);
    AudioDeviceInterface.LogTraceEntry("");
    try
    {
      Object localObject1 = this.p;
      Object localObject2 = new com/tencent/rtmp/sharp/jni/TraeAudioSessionHost;
      ((TraeAudioSessionHost)localObject2).<init>();
      ((TraeAudioManager)localObject1)._audioSessionHost = ((TraeAudioSessionHost)localObject2);
      localObject2 = this.p;
      localObject1 = new com/tencent/rtmp/sharp/jni/TraeAudioManager$e;
      ((TraeAudioManager.e)localObject1).<init>(this.p);
      ((TraeAudioManager)localObject2)._deviceConfigManager = ((TraeAudioManager.e)localObject1);
      TraeAudioManager._gHostProcessId = Process.myPid();
      this.p._am = ((AudioManager)this.p._context.getSystemService("audio"));
      this.p._bluetoothCheck = this.p.CreateBluetoothCheck(this.p._context, this.p._deviceConfigManager);
      localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>();
      ((IntentFilter)localObject1).addAction("android.intent.action.HEADSET_PLUG");
      ((IntentFilter)localObject1).addAction("android.media.AUDIO_BECOMING_NOISY");
      this.p._bluetoothCheck.b((IntentFilter)localObject1);
      ((IntentFilter)localObject1).addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
      this.p._context.registerReceiver(this.h, (IntentFilter)localObject1);
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65681);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "======7");
    }
  }

  int d(HashMap<String, Object> paramHashMap)
  {
    int i1 = -1;
    AppMethodBeat.i(65689);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode);
    if (this.p._am == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " InternalVoicecallPostprocess am==null!!");
      AppMethodBeat.o(65689);
    }
    while (true)
    {
      return i1;
      if (this.p._activeMode != 1)
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " not ACTIVE_VOICECALL!!");
        Intent localIntent = new Intent();
        this.p.sendResBroadcast(localIntent, paramHashMap, 3);
        AppMethodBeat.o(65689);
      }
      else
      {
        this.p._activeMode = 0;
        g();
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65689);
        i1 = 0;
      }
    }
  }

  void d()
  {
    AppMethodBeat.i(65682);
    try
    {
      this.p._am = ((AudioManager)this.p._context.getSystemService("audio"));
      if (this.p._bluetoothCheck == null)
        this.p._bluetoothCheck = this.p.CreateBluetoothCheck(this.p._context, this.p._deviceConfigManager);
      this.p._context.unregisterReceiver(this.h);
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      localIntentFilter.<init>();
      localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
      localIntentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
      this.p._bluetoothCheck.b(localIntentFilter);
      localIntentFilter.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
      this.p._context.registerReceiver(this.h, localIntentFilter);
      AppMethodBeat.o(65682);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(65682);
    }
  }

  int e(HashMap<String, Object> paramHashMap)
  {
    boolean bool1 = true;
    int i1 = 0;
    AppMethodBeat.i(65691);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode);
    if (this.p._am == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " InternalStartRing am==null!!");
      AppMethodBeat.o(65691);
      i1 = -1;
      return i1;
    }
    if (this.p._activeMode == 2)
      i();
    while (true)
    {
      try
      {
        this.c = ((Long)paramHashMap.get("PARAM_SESSIONID")).longValue();
        this.d = ((String)paramHashMap.get("PARAM_OPERATION"));
        this.e = ((String)paramHashMap.get("PARAM_RING_USERDATA_STRING"));
        int i2 = ((Integer)paramHashMap.get("PARAM_RING_DATASOURCE")).intValue();
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "  dataSource:".concat(String.valueOf(i2)));
        int i3 = ((Integer)paramHashMap.get("PARAM_RING_RSID")).intValue();
        Uri localUri = (Uri)paramHashMap.get("PARAM_RING_URI");
        String str = (String)paramHashMap.get("PARAM_RING_FILEPATH");
        boolean bool2 = ((Boolean)paramHashMap.get("PARAM_RING_LOOP")).booleanValue();
        int i4 = ((Integer)paramHashMap.get("PARAM_RING_LOOPCOUNT")).intValue();
        boolean bool3 = ((Boolean)paramHashMap.get("PARAM_RING_MODE")).booleanValue();
        if (this.p._activeMode != 1)
          this.p._activeMode = 2;
        Intent localIntent = new Intent();
        localIntent.putExtra("PARAM_RING_USERDATA_STRING", this.e);
        this.p.sendResBroadcast(localIntent, paramHashMap, 0);
        this.k = this.p._am.getMode();
        paramHashMap = this.b;
        if (this.p._activeMode != 1)
          break label482;
        paramHashMap.playRing(i2, i3, localUri, str, bool2, i4, bool3, bool1, this.p._streamType);
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, " _ringUserdata:" + this.e + " DurationMS:" + this.b.getDuration());
        if (!this.b.hasCall())
          a(this.b.getStreamType());
        b(this.b.getStreamType());
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65691);
      }
      catch (Exception paramHashMap)
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " startRing err params");
        AppMethodBeat.o(65691);
        i1 = -1;
      }
      break;
      label482: bool1 = false;
    }
  }

  void e()
  {
    AppMethodBeat.i(65683);
    try
    {
      if (this.p._bluetoothCheck != null)
        this.p._bluetoothCheck.a();
      this.p._bluetoothCheck = null;
      if (this.p._context != null)
      {
        this.p._context.unregisterReceiver(this.h);
        IntentFilter localIntentFilter = new android/content/IntentFilter;
        localIntentFilter.<init>();
        localIntentFilter.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
        this.p._context.registerReceiver(this.h, localIntentFilter);
      }
      AppMethodBeat.o(65683);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(65683);
    }
  }

  int f(HashMap<String, Object> paramHashMap)
  {
    int i1 = 0;
    AppMethodBeat.i(65692);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode + " _preRingMode:" + this.k);
    if ((this.p._am == null) || (this.b == null))
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " InternalStopRing am==null!!");
      i1 = -1;
      AppMethodBeat.o(65692);
    }
    while (true)
    {
      return i1;
      this.b.stopRing();
      if ((!this.b.hasCall()) && (this.p._activeMode == 2))
      {
        g();
        this.p._activeMode = 0;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("PARAM_RING_USERDATA_STRING", this.e);
      this.p.sendResBroadcast(localIntent, paramHashMap, 0);
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65692);
    }
  }

  void f()
  {
    AppMethodBeat.i(65684);
    AudioDeviceInterface.LogTraceEntry("");
    try
    {
      b();
      if (this.p._bluetoothCheck != null)
        this.p._bluetoothCheck.a();
      this.p._bluetoothCheck = null;
      if (this.p._context != null)
      {
        this.p._context.unregisterReceiver(this.h);
        this.p._context = null;
      }
      if (this.p._deviceConfigManager != null)
        this.p._deviceConfigManager.a();
      this.p._deviceConfigManager = null;
      label103: AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65684);
      return;
    }
    catch (Exception localException)
    {
      break label103;
    }
  }

  int g(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(65693);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode + " _preRingMode:" + this.k);
    if (this.p._am == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " InternalStopRing am==null!!");
      i1 = -1;
      AppMethodBeat.o(65693);
      return i1;
    }
    if (this.p._activeMode == 2);
    for (int i1 = this.b.getStreamType(); ; i1 = this.p._streamType)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("EXTRA_DATA_STREAMTYPE", i1);
      this.p.sendResBroadcast(localIntent, paramHashMap, 0);
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65693);
      i1 = 0;
      break;
    }
  }

  @TargetApi(8)
  void g()
  {
    AppMethodBeat.i(65687);
    if (Build.VERSION.SDK_INT <= 8)
      AppMethodBeat.o(65687);
    while (true)
    {
      return;
      if ((this.p._am != null) && (this.n != null))
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "-------abandonAudioFocus _focusSteamType:" + this.o);
        this.p._am.abandonAudioFocus(this.n);
        this.n = null;
      }
      AppMethodBeat.o(65687);
    }
  }

  int h()
  {
    int i1 = -1;
    AppMethodBeat.i(65690);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode);
    if (this.p._am == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " am==null!!");
      AppMethodBeat.o(65690);
    }
    while (true)
    {
      return i1;
      if (this.p._activeMode != 1)
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " not ACTIVE_RING!!");
        AppMethodBeat.o(65690);
      }
      else
      {
        this.p._activeMode = 0;
        if (this.p._prevMode != -1)
          this.p.InternalSetMode(this.p._prevMode);
        HashMap localHashMap = new HashMap();
        localHashMap.put("PARAM_SESSIONID", Long.valueOf(this.l));
        localHashMap.put("PARAM_OPERATION", this.m);
        Intent localIntent = new Intent();
        this.p.sendResBroadcast(localIntent, localHashMap, 6);
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65690);
        i1 = 0;
      }
    }
  }

  int i()
  {
    int i1 = -1;
    AppMethodBeat.i(65695);
    AudioDeviceInterface.LogTraceEntry(" activeMode:" + this.p._activeMode + " _preRingMode:" + this.k);
    if (this.p._am == null)
    {
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, " interruptRing am==null!!");
      AppMethodBeat.o(65695);
    }
    while (true)
    {
      return i1;
      if (this.p._activeMode != 2)
      {
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, " not ACTIVE_RING!!");
        AppMethodBeat.o(65695);
      }
      else
      {
        this.b.stopRing();
        g();
        this.p._activeMode = 0;
        HashMap localHashMap = new HashMap();
        localHashMap.put("PARAM_SESSIONID", Long.valueOf(this.c));
        localHashMap.put("PARAM_OPERATION", this.d);
        Intent localIntent = new Intent();
        localIntent.putExtra("PARAM_RING_USERDATA_STRING", this.e);
        this.p.sendResBroadcast(localIntent, localHashMap, 4);
        AudioDeviceInterface.LogTraceExit();
        AppMethodBeat.o(65695);
        i1 = 0;
      }
    }
  }

  void j()
  {
    AppMethodBeat.i(65696);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(this.c));
    localHashMap.put("PARAM_OPERATION", "NOTIFY_RING_COMPLETION");
    Intent localIntent = new Intent();
    localIntent.putExtra("PARAM_RING_USERDATA_STRING", this.e);
    this.p.sendResBroadcast(localIntent, localHashMap, 0);
    AppMethodBeat.o(65696);
  }

  public void run()
  {
    AppMethodBeat.i(65680);
    AudioDeviceInterface.LogTraceEntry("");
    Looper.prepare();
    this.a = new TraeAudioManager.f.2(this);
    c();
    synchronized (this.f)
    {
      this.f[0] = true;
      this.f.notify();
      Looper.loop();
      f();
    }
    synchronized (this.f)
    {
      this.f[0] = false;
      this.f.notify();
      AudioDeviceInterface.LogTraceExit();
      AppMethodBeat.o(65680);
      return;
      localObject2 = finally;
      AppMethodBeat.o(65680);
      throw localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.f
 * JD-Core Version:    0.6.2
 */