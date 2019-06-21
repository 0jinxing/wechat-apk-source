package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.g.a.jw.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class g
{
  private static volatile g eoX;
  private static boolean epb;
  public static boolean epc;
  private static boolean epd;
  private static boolean epe;
  private static int epm;
  private static int epn;
  private static HashMap<Integer, String> epo;
  private static int epp;
  private static int epq;
  private static HashMap<Integer, String> epr;
  private static int eps;
  private static int ept;
  private static HashMap<Integer, String> epu;
  public final AudioManager eoY;
  private int eoZ;
  private String epa;
  private int epf;
  private final Set<a> epg;
  private final int eph;
  private ak epi;
  private ak epj;
  private ak epk;
  private int epl;

  static
  {
    AppMethodBeat.i(92892);
    eoX = null;
    epb = false;
    epc = false;
    epd = false;
    epe = false;
    epm = 0;
    epn = 0;
    epo = new HashMap();
    epp = 0;
    epq = 0;
    epr = new HashMap();
    eps = 0;
    ept = 0;
    epu = new HashMap();
    AppMethodBeat.o(92892);
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public g(Context paramContext)
  {
    AppMethodBeat.i(92856);
    this.eoZ = -1;
    this.epf = 0;
    this.epg = new HashSet();
    this.eph = 1000;
    this.epi = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(92851);
        ab.i("MicroMsg.MMAudioManager", "dkbt post delay BLUETOOTH_DEVICE_CONNECTED ");
        g.this.iI(3);
        AppMethodBeat.o(92851);
      }
    };
    this.epj = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(92842);
        ab.i("MicroMsg.MMAudioManager", "dkbt post delay BLUETOOTH_DEVICE_ACTIVE ");
        g.this.iI(5);
        AppMethodBeat.o(92842);
      }
    };
    this.epk = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(92843);
        ab.i("MicroMsg.MMAudioManager", "dkbt post delay BLUETOOTH_DEVICE_CONNECTED ");
        g.this.setMode(0);
        AppMethodBeat.o(92843);
      }
    };
    this.epl = -1;
    this.eoY = ((AudioManager)paramContext.getSystemService("audio"));
    ab.i("MicroMsg.MMAudioManager", "init dkbt %s", new Object[] { KT() });
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(92841);
        ab.i("MicroMsg.MMAudioManager", "leonl onReceive action[ ACTION_AUDIO_BECOMING_NOISY ] ");
        g.this.iI(7);
        AppMethodBeat.o(92841);
      }
    }
    , new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(92844);
        int i = paramAnonymousIntent.getIntExtra("state", -1);
        ab.i("MicroMsg.MMAudioManager", "leonl onReceive action[ HEADSET_PLUG ] state = %s,mic = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousIntent.getIntExtra("microphone", -1)) });
        if (i == 0)
        {
          g.this.iI(6);
          AppMethodBeat.o(92844);
        }
        while (true)
        {
          return;
          if (i == 1)
            g.this.KN();
          AppMethodBeat.o(92844);
        }
      }
    }
    , new IntentFilter("android.intent.action.HEADSET_PLUG"));
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(92845);
        if (paramAnonymousIntent == null)
          AppMethodBeat.o(92845);
        while (true)
        {
          return;
          paramAnonymousContext = paramAnonymousIntent.getAction();
          g.access$002(paramAnonymousIntent.getBooleanExtra("existing", false));
          ab.i("MicroMsg.MMAudioManager", "dkbt onReceive action[" + paramAnonymousContext + "] existing:" + g.epd);
          AppMethodBeat.o(92845);
        }
      }
    }
    , new IntentFilter("com.htc.accessory.action.CONNECTION_EXISTING"));
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(92846);
        paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (paramAnonymousContext == null)
        {
          ab.i("MicroMsg.MMAudioManager", "device is unavailable");
          AppMethodBeat.o(92846);
        }
        while (true)
        {
          return;
          if (g.a(g.this) == null)
          {
            g.a(g.this, paramAnonymousContext.getAddress());
            AppMethodBeat.o(92846);
          }
          else
          {
            if (g.a(g.this).equals(paramAnonymousContext.getAddress()))
            {
              ab.i("MicroMsg.MMAudioManager", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_CONNECTED ] ");
              if (d.fP(11))
              {
                g.access$202(true);
                g.b(g.this).sendEmptyMessageDelayed(0, 1000L);
              }
            }
            AppMethodBeat.o(92846);
          }
        }
      }
    }
    , new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"));
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(92847);
        ab.i("MicroMsg.MMAudioManager", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_DISCONNECTED ] ");
        paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (paramAnonymousContext == null)
        {
          ab.i("MicroMsg.MMAudioManager", "pre address is null");
          AppMethodBeat.o(92847);
        }
        while (true)
        {
          return;
          if (paramAnonymousContext.getAddress().equals(g.a(g.this)))
          {
            ab.i("MicroMsg.MMAudioManager", "pre connect device is " + paramAnonymousContext.getAddress());
            g.access$202(false);
            g.a(g.this, null);
            if (q.etn.erJ == 1)
              com.tencent.mm.compatible.c.a.b(g.c(g.this));
            g.this.iI(4);
          }
          AppMethodBeat.o(92847);
        }
      }
    }
    , new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED"));
    if (d.iW(11))
      paramContext.registerReceiver(new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          AppMethodBeat.i(92848);
          if (paramAnonymousIntent == null)
            AppMethodBeat.o(92848);
          while (true)
          {
            return;
            paramAnonymousContext = paramAnonymousIntent.getAction();
            int i = paramAnonymousIntent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            paramAnonymousIntent = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (paramAnonymousIntent == null)
            {
              ab.i("MicroMsg.MMAudioManager", "pre address is null");
              AppMethodBeat.o(92848);
            }
            else if (g.a(g.this) == null)
            {
              g.a(g.this, paramAnonymousIntent.getAddress());
              AppMethodBeat.o(92848);
            }
            else if (paramAnonymousIntent.getAddress().equals(g.a(g.this)))
            {
              ab.i("MicroMsg.MMAudioManager", "dkbt onReceive action[" + paramAnonymousContext + "] state:" + i);
              if (i == 2)
              {
                g.access$202(true);
                g.b(g.this).sendEmptyMessageDelayed(0, 1000L);
                AppMethodBeat.o(92848);
              }
              else if (i == 0)
              {
                g.access$202(false);
                if (q.etn.erJ == 1)
                  com.tencent.mm.compatible.c.a.b(g.c(g.this));
                g.this.iI(4);
                g.a(g.this, null);
              }
            }
            else
            {
              AppMethodBeat.o(92848);
            }
          }
        }
      }
      , new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(92849);
        if (paramAnonymousIntent == null)
          AppMethodBeat.o(92849);
        while (true)
        {
          return;
          int i = paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
          int j = paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
          paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
          if (paramAnonymousContext == null)
          {
            ab.i("MicroMsg.MMAudioManager", "pre address is null");
            AppMethodBeat.o(92849);
          }
          else
          {
            if (paramAnonymousContext.getAddress().equals(g.a(g.this)))
            {
              ab.i("MicroMsg.MMAudioManager", "onReceive bluetooth state changed: %s, prevState: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              if (i == 10)
              {
                g.access$202(false);
                g.Lf();
                if (q.etn.erJ == 1)
                  com.tencent.mm.compatible.c.a.b(g.c(g.this));
                g.this.iI(4);
              }
            }
            AppMethodBeat.o(92849);
          }
        }
      }
    }
    , new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    if (d.iW(28))
      paramContext.registerReceiver(new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          AppMethodBeat.i(92850);
          if (paramAnonymousIntent == null)
            AppMethodBeat.o(92850);
          while (true)
          {
            return;
            paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (paramAnonymousContext == null)
            {
              ab.i("MicroMsg.MMAudioManager", "device is unavailable");
              AppMethodBeat.o(92850);
            }
            else
            {
              g.a(g.this, paramAnonymousContext.getAddress());
              g.d(g.this).removeMessages(0);
              g.e(g.this).sendEmptyMessageDelayed(0, 1000L);
              ab.i("MicroMsg.MMAudioManager", "android pie switch bt device");
              AppMethodBeat.o(92850);
            }
          }
        }
      }
      , new IntentFilter("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED"));
    AppMethodBeat.o(92856);
  }

  public static g KK()
  {
    AppMethodBeat.i(92852);
    if (eoX == null);
    try
    {
      if (eoX == null)
      {
        localg = new com/tencent/mm/compatible/b/g;
        localg.<init>(ah.getContext());
        eoX = localg;
      }
      g localg = eoX;
      AppMethodBeat.o(92852);
      return localg;
    }
    finally
    {
      AppMethodBeat.o(92852);
    }
  }

  public static boolean KO()
  {
    return false;
  }

  @TargetApi(14)
  private static boolean KQ()
  {
    boolean bool1 = true;
    AppMethodBeat.i(92861);
    try
    {
      if (Build.VERSION.SDK_INT >= 14)
      {
        int i = BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1);
        ab.i("MicroMsg.MMAudioManager", "isConnectHeadset getProfileConnectionState: %s", new Object[] { Integer.valueOf(i) });
        if (i == 2)
          AppMethodBeat.o(92861);
      }
      while (true)
      {
        return bool1;
        AppMethodBeat.o(92861);
        bool1 = false;
        continue;
        boolean bool2 = epb;
        if (bool2)
        {
          AppMethodBeat.o(92861);
        }
        else
        {
          if (q.etn.erU != 1)
            break;
          bool1 = BluetoothAdapter.getDefaultAdapter().isEnabled();
          AppMethodBeat.o(92861);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMAudioManager", "dkbt exception in isConnectDevice()");
        AppMethodBeat.o(92861);
        bool1 = false;
      }
    }
  }

  public static int KR()
  {
    AppMethodBeat.i(92863);
    ((AudioManager)ah.getContext().getSystemService("audio")).isBluetoothScoOn();
    AppMethodBeat.o(92863);
    return 0;
  }

  public static boolean KS()
  {
    AppMethodBeat.i(92864);
    ab.d("MicroMsg.MMAudioManager", "dkbt isBluetoothCanUse existing:" + epd + " , isUseHTCAccessory = " + epe);
    boolean bool;
    if ((epd) && (!epe))
    {
      AppMethodBeat.o(92864);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.MMAudioManager", "dkbt isACLConnected:" + epb);
      bool = KQ();
      if (!bool)
      {
        ab.i("MicroMsg.MMAudioManager", "dkbt isACLConnected =  " + epb + " , isConnectHeadset() = " + bool);
        AppMethodBeat.o(92864);
        bool = false;
      }
      else
      {
        localObject = BluetoothAdapter.getDefaultAdapter();
        if (localObject == null)
        {
          ab.d("MicroMsg.MMAudioManager", "dkbt BluetoothAdapter.getDefaultAdapter() == null");
          AppMethodBeat.o(92864);
          bool = false;
        }
        else if (!((BluetoothAdapter)localObject).isEnabled())
        {
          ab.i("MicroMsg.MMAudioManager", "dkbt !adp.isEnabled()");
          AppMethodBeat.o(92864);
          bool = false;
        }
        else
        {
          localObject = ((BluetoothAdapter)localObject).getBondedDevices();
          if ((localObject != null) && (((Set)localObject).size() != 0))
            break;
          ab.e("MicroMsg.MMAudioManager", "dkbt setDev == null || setDev.size() == 0");
          AppMethodBeat.o(92864);
          bool = false;
        }
      }
    }
    Object localObject = ((Set)localObject).iterator();
    do
      if (!((Iterator)localObject).hasNext())
        break;
    while (((BluetoothDevice)((Iterator)localObject).next()).getBondState() != 12);
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        ab.i("MicroMsg.MMAudioManager", "dkbt hasBond == false");
        AppMethodBeat.o(92864);
        bool = false;
        break;
      }
      ab.i("MicroMsg.MMAudioManager", "alvinluo isBluetoothCanUse: %b", new Object[] { Boolean.TRUE });
      AppMethodBeat.o(92864);
      bool = true;
      break;
    }
  }

  private boolean KW()
  {
    boolean bool = true;
    AppMethodBeat.i(92871);
    int j;
    if ((this.eoY != null) && (d.iW(23)))
    {
      AudioDeviceInfo[] arrayOfAudioDeviceInfo = this.eoY.getDevices(3);
      int i = arrayOfAudioDeviceInfo.length;
      j = 0;
      if (j < i)
      {
        AudioDeviceInfo localAudioDeviceInfo = arrayOfAudioDeviceInfo[j];
        ab.i("MicroMsg.MMAudioManager", "isWireHeadsetPluggedNew, deviceInfo type: %s", new Object[] { Integer.valueOf(localAudioDeviceInfo.getType()) });
        if ((localAudioDeviceInfo.getType() == 4) || (localAudioDeviceInfo.getType() == 3) || (localAudioDeviceInfo.getType() == 11))
          AppMethodBeat.o(92871);
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(92871);
      bool = false;
    }
  }

  private void KZ()
  {
    AppMethodBeat.i(92876);
    if (this.eoY != null)
    {
      int i = this.eoY.getMode();
      boolean bool = this.eoY.isSpeakerphoneOn();
      Object localObject1 = com.tencent.mm.compatible.e.l.Lu().aH(98305);
      Object localObject2 = com.tencent.mm.compatible.e.l.Lu().aH(94209);
      if (localObject1 == null)
      {
        com.tencent.mm.compatible.e.l.Lu().set(98305, Boolean.valueOf(bool));
        ab.d("MicroMsg.MMAudioManager", "storeAudioConfig spearkeron ".concat(String.valueOf(bool)));
      }
      if (localObject2 == null)
      {
        com.tencent.mm.compatible.e.l.Lu().set(94209, Integer.valueOf(i));
        ab.d("MicroMsg.MMAudioManager", "storeAudioConfig inmode ".concat(String.valueOf(i)));
      }
    }
    AppMethodBeat.o(92876);
  }

  private static void Ld()
  {
    AppMethodBeat.i(92890);
    jw localjw = new jw();
    if (epm - epn > 1)
    {
      localjw.cFd.cFe = true;
      localjw.cFd.cFf = epo.size();
    }
    if (eps - ept > 1)
    {
      localjw.cFd.cFg = true;
      localjw.cFd.cFh = epu.size();
    }
    if (epp - epq > 1)
    {
      localjw.cFd.cFi = true;
      localjw.cFd.cFj = epr.size();
    }
    if ((localjw.cFd.cFg) || (localjw.cFd.cFe) || (localjw.cFd.cFi))
    {
      ab.e("MicroMsg.MMAudioManager", "check media leak audio[%b %d] mediaplayer[%b %d] audioRecordLeak [%b %d]", new Object[] { Boolean.valueOf(localjw.cFd.cFe), Integer.valueOf(localjw.cFd.cFf), Boolean.valueOf(localjw.cFd.cFg), Integer.valueOf(localjw.cFd.cFh), Boolean.valueOf(localjw.cFd.cFi), Integer.valueOf(localjw.cFd.cFj) });
      com.tencent.mm.sdk.b.a.xxA.m(localjw);
    }
    AppMethodBeat.o(92890);
  }

  public static String Le()
  {
    AppMethodBeat.i(92891);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("AudioTrack: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(epo.size()).append("init: ").append(epm).append("release: ").append(epn).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    Iterator localIterator;
    if (!epo.isEmpty())
    {
      localIterator = epo.values().iterator();
      while (localIterator.hasNext())
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
    }
    ((StringBuffer)localObject).append("MediaPlayer: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(epu.size()).append("init: ").append(eps).append("release: ").append(ept).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    if (!epu.isEmpty())
    {
      localIterator = epu.values().iterator();
      while (localIterator.hasNext())
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
    }
    ((StringBuffer)localObject).append("AudioRecord: \r\n");
    ((StringBuffer)localObject).append("leak: ").append(epr.size()).append("init: ").append(epp).append("release: ").append(epp).append("\r\n");
    ((StringBuffer)localObject).append("--------leak map-----------\r\n");
    if (!epr.isEmpty())
    {
      localIterator = epr.values().iterator();
      while (localIterator.hasNext())
        ((StringBuffer)localObject).append((String)localIterator.next()).append("\r\n");
    }
    localObject = ((StringBuffer)localObject).toString();
    ab.e("MicroMsg.MMAudioManager", "leak? %s", new Object[] { localObject });
    AppMethodBeat.o(92891);
    return localObject;
  }

  public static void iL(int paramInt)
  {
    AppMethodBeat.i(92884);
    epm += 1;
    ab.e("MicroMsg.MMAudioManager", "mm audio track init [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(epm), Integer.valueOf(epn) });
    epo.put(Integer.valueOf(paramInt), bo.dpG().toString());
    Ld();
    AppMethodBeat.o(92884);
  }

  public static void iM(int paramInt)
  {
    AppMethodBeat.i(92885);
    epn += 1;
    ab.e("MicroMsg.MMAudioManager", "mm audio track release [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(epm), Integer.valueOf(epn) });
    epo.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(92885);
  }

  public static void iN(int paramInt)
  {
    AppMethodBeat.i(92886);
    epp += 1;
    ab.c("MicroMsg.MMAudioManager", "mm audio record init [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(epp), Integer.valueOf(epq) });
    epr.put(Integer.valueOf(paramInt), bo.dpG().toString());
    Ld();
    AppMethodBeat.o(92886);
  }

  public static void iO(int paramInt)
  {
    AppMethodBeat.i(92887);
    if (epr.containsKey(Integer.valueOf(paramInt)))
    {
      epq += 1;
      ab.c("MicroMsg.MMAudioManager", "mm audio record release [%d] mmInitCount[%d] mmReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(epp), Integer.valueOf(epq) });
      epr.remove(Integer.valueOf(paramInt));
    }
    AppMethodBeat.o(92887);
  }

  public static void iP(int paramInt)
  {
    AppMethodBeat.i(92888);
    eps += 1;
    ab.e("MicroMsg.MMAudioManager", "mm media player init [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(eps), Integer.valueOf(ept) });
    epu.put(Integer.valueOf(paramInt), bo.dpG().toString());
    Ld();
    AppMethodBeat.o(92888);
  }

  public static void iQ(int paramInt)
  {
    AppMethodBeat.i(92889);
    ept += 1;
    ab.e("MicroMsg.MMAudioManager", "mm media player release [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(eps), Integer.valueOf(ept) });
    epu.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(92889);
  }

  public final void KL()
  {
    AppMethodBeat.i(92857);
    ab.i("MicroMsg.MMAudioManager", "dkbt bluetoothStopped %s", new Object[] { KT() });
    epc = false;
    iI(2);
    AppMethodBeat.o(92857);
  }

  public final int KM()
  {
    int i = -1;
    AppMethodBeat.i(92858);
    this.eoZ = -1;
    if (!KS())
      AppMethodBeat.o(92858);
    while (true)
    {
      return i;
      ab.c("MicroMsg.MMAudioManager", "dkbt begin tryStartBluetooth %s", new Object[] { KT() });
      boolean bool = com.tencent.mm.compatible.c.a.a(this.eoY);
      ab.i("MicroMsg.MMAudioManager", "dkbt end tryStartBluetooth %s ret:%s", new Object[] { KT(), Boolean.valueOf(bool) });
      ab.d("MicroMsg.MMAudioManager", "dkbt  tryStartBluetooth " + KT() + " ret:" + bool);
      bool = KP();
      ab.i("MicroMsg.MMAudioManager", "alvinluo isBluetoothOn: %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        AppMethodBeat.o(92858);
        i = 1;
      }
      else
      {
        AppMethodBeat.o(92858);
        i = 0;
      }
    }
  }

  public final void KN()
  {
    AppMethodBeat.i(92859);
    epc = false;
    ab.c("MicroMsg.MMAudioManager", "dkbt begin stopBluetooth %s", new Object[] { KT() });
    com.tencent.mm.compatible.c.a.b(this.eoY);
    this.epi.removeCallbacksAndMessages(Integer.valueOf(1));
    ab.i("MicroMsg.MMAudioManager", "dkbt end stopBluetooth %s", new Object[] { KT() });
    AppMethodBeat.o(92859);
  }

  public final boolean KP()
  {
    boolean bool1 = false;
    AppMethodBeat.i(92860);
    boolean bool2 = this.eoY.isBluetoothScoOn();
    boolean bool3 = this.eoY.isBluetoothA2dpOn();
    ab.i("MicroMsg.MMAudioManager", "isBluetoothScoOn: %s isBluetoothA2dpOn: %s, isScoConnected: %s, isBluetoothCanUse: %s, isACLConnected: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(epc), Boolean.valueOf(KS()), Boolean.valueOf(epb) });
    if ((bool2) || (bool3) || (epc))
    {
      AppMethodBeat.o(92860);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(92860);
    }
  }

  public final String KT()
  {
    AppMethodBeat.i(92865);
    if (this.eoY != null);
    for (int i = this.eoY.getMode(); ; i = 0)
    {
      String str = "mode:" + i + " isSpeakerphoneOn:" + this.eoY.isSpeakerphoneOn() + " isBluetoothOn:" + KP() + " btStatus:" + this.eoZ;
      AppMethodBeat.o(92865);
      return str;
    }
  }

  public final boolean KU()
  {
    AppMethodBeat.i(92866);
    boolean bool;
    if (this.eoY.getMode() == 0)
    {
      bool = true;
      AppMethodBeat.o(92866);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92866);
    }
  }

  public final boolean KV()
  {
    AppMethodBeat.i(92870);
    boolean bool2;
    if (this.eoY != null)
    {
      boolean bool1 = this.eoY.isWiredHeadsetOn();
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (d.iW(23))
          bool2 = KW();
      }
      AppMethodBeat.o(92870);
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      AppMethodBeat.o(92870);
    }
  }

  public final void KX()
  {
    AppMethodBeat.i(92874);
    if (this.eoY != null)
      this.eoY.setStreamMute(3, true);
    AppMethodBeat.o(92874);
  }

  public final void KY()
  {
    AppMethodBeat.i(92875);
    if (this.eoY != null)
      this.eoY.setStreamMute(3, false);
    AppMethodBeat.o(92875);
  }

  @Deprecated
  public final void La()
  {
    AppMethodBeat.i(92877);
    Object localObject1;
    Object localObject2;
    if (this.eoY != null)
    {
      localObject1 = com.tencent.mm.compatible.e.l.Lu().aH(98305);
      localObject2 = com.tencent.mm.compatible.e.l.Lu().aH(94209);
      if (localObject1 != null)
      {
        ab.d("MicroMsg.MMAudioManager", "resumeAudioConfig spearkeron: ".concat(String.valueOf(localObject1)));
        setSpeakerphoneOn(((Boolean)localObject1).booleanValue());
        com.tencent.mm.compatible.e.l.Lu().set(98305, null);
      }
      if (localObject2 == null);
    }
    try
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("resumeAudioConfig oinmode: ");
      ab.i("MicroMsg.MMAudioManager", localObject2 + ",inmode:0");
      i = bo.getInt(String.valueOf(localObject2), 0);
      if ((i >= -1) && (i < 4))
      {
        setMode(i);
        com.tencent.mm.compatible.e.l.Lu().set(94209, null);
        AppMethodBeat.o(92877);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = 0;
        continue;
        setMode(0);
      }
    }
  }

  public final int Lb()
  {
    int i = this.epf;
    this.epf = 0;
    return i;
  }

  public final int Lc()
  {
    AppMethodBeat.i(92883);
    if (this.epl == -1);
    try
    {
      Field localField = Class.forName("android.media.AudioManager").getField("STREAM_BLUETOOTH_SCO");
      if ((localField != null) && (this.eoY != null))
        this.epl = localField.getInt(this.eoY);
      int i = this.epl;
      AppMethodBeat.o(92883);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMAudioManager", "ClassNotFoundException  android.media.AudioManager,exception:" + localException.getMessage());
        this.epl = 6;
      }
    }
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(92853);
    if (parama != null)
      this.epg.add(parama);
    AppMethodBeat.o(92853);
  }

  public final void b(a parama)
  {
    AppMethodBeat.i(92854);
    if (parama != null)
      this.epg.remove(parama);
    AppMethodBeat.o(92854);
  }

  public final boolean b(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    AppMethodBeat.i(92869);
    int i = this.eoY.getStreamMaxVolume(paramInt);
    ab.d("MicroMsg.MMAudioManager", "maxVolumn:".concat(String.valueOf(i)));
    int j = i / 3;
    i = this.eoY.getStreamVolume(paramInt);
    if (i < j)
      a.b(this.eoY, paramInt, j);
    ab.i("MicroMsg.MMAudioManager", "StreamType:" + paramInt + "  current:" + i);
    paramBoolean1 = f(paramBoolean1, true, paramBoolean2);
    AppMethodBeat.o(92869);
    return paramBoolean1;
  }

  public final int bE(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(92862);
    int j;
    if (paramBoolean)
    {
      j = 3;
      if (!KP())
        break label36;
      j = i;
    }
    label36: 
    while (true)
    {
      AppMethodBeat.o(92862);
      return j;
      j = 0;
      break;
    }
  }

  @TargetApi(11)
  public final boolean bF(boolean paramBoolean)
  {
    int i = 3;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(92868);
    ab.d("MicroMsg.MMAudioManager", "IPCall dkbt shiftSpeaker:%b -> %b  %s", new Object[] { Boolean.valueOf(KU()), Boolean.valueOf(paramBoolean), KT() });
    if (ax.Ex())
    {
      ab.v("MicroMsg.MMAudioManager", "shiftSpeaker return when calling blue:%d", new Object[] { Integer.valueOf(this.eoZ) });
      AppMethodBeat.o(92868);
    }
    for (paramBoolean = false; ; paramBoolean = false)
    {
      return paramBoolean;
      if (!epc)
        break;
      setMode(3);
      AppMethodBeat.o(92868);
    }
    KZ();
    if (q.etd.eqF)
    {
      if (paramBoolean)
      {
        if (Build.VERSION.SDK_INT < 11);
        for (i = k; ; i = 3)
        {
          if (q.etd.eqG >= 0)
            i = q.etd.eqG;
          ab.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker useSpeakerMode:".concat(String.valueOf(i)));
          if (i != this.eoY.getMode())
            setMode(i);
          if (!this.eoY.isSpeakerphoneOn())
            setSpeakerphoneOn(true);
          label199: AppMethodBeat.o(92868);
          break;
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (q.etn.erU != 1)
          break label714;
        ab.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
      }
    }
    label709: label714: for (i = 0; ; i = 2)
    {
      if (q.etd.eqH >= 0)
        i = q.etd.eqH;
      ab.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker usePhoneMode:".concat(String.valueOf(i)));
      if (i != this.eoY.getMode())
        setMode(i);
      if (!this.eoY.isSpeakerphoneOn())
        break label199;
      setSpeakerphoneOn(false);
      break label199;
      if (q.etd.epG)
      {
        if (q.etd.Lg())
        {
          if (q.etd.epI >= 0)
            setMode(q.etd.epI);
          while (true)
          {
            if (q.etd.epK > 0)
              setSpeakerphoneOn(paramBoolean);
            AppMethodBeat.o(92868);
            break;
            if (q.etd.epJ >= 0)
              if (paramBoolean)
                setMode(0);
              else
                setMode(2);
          }
        }
        if (q.etd.Lh())
        {
          if (paramBoolean)
          {
            if (q.etd.Lk())
              setSpeakerphoneOn(true);
            if (q.etd.Lj() >= 0)
              setMode(q.etd.Lj());
          }
          while (true)
          {
            AppMethodBeat.o(92868);
            break;
            if (q.etd.Lm())
              setSpeakerphoneOn(false);
            if (q.etd.Ll() >= 0)
              setMode(q.etd.Ll());
          }
        }
      }
      if (paramBoolean)
      {
        if (Build.VERSION.SDK_INT < 11);
        for (i = j; ; i = 3)
        {
          if (q.etd.eqg >= 0)
            i = q.etd.eqg;
          ab.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker useSpeakerMode:".concat(String.valueOf(i)));
          if (i != this.eoY.getMode())
            setMode(i);
          if (!this.eoY.isSpeakerphoneOn())
            setSpeakerphoneOn(true);
          AppMethodBeat.o(92868);
          break;
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (q.etn.erU != 1)
          break label709;
        ab.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
      }
      for (i = 0; ; i = 2)
      {
        k = i;
        if (Build.VERSION.SDK_INT >= 11)
        {
          k = i;
          if (com.tencent.mm.compatible.util.l.IN())
          {
            k = i;
            if (2 == q.etn.erV)
              k = 2;
          }
        }
        if (q.etd.eqh >= 0)
          k = q.etd.eqh;
        ab.d("MicroMsg.MMAudioManager", "IPCall doShiftSpeaker usePhoneMode:".concat(String.valueOf(k)));
        if (k != this.eoY.getMode())
          setMode(k);
        if (!this.eoY.isSpeakerphoneOn())
          break;
        setSpeakerphoneOn(false);
        break;
      }
    }
  }

  public final void bR(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92882);
    if (this.eoY != null)
    {
      ab.i("MicroMsg.MMAudioManager", "setStreamVolume streamType:%s,index:%s,flags:%s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      a.b(this.eoY, paramInt1, paramInt2);
    }
    AppMethodBeat.o(92882);
  }

  @TargetApi(11)
  public final boolean f(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 0;
    AppMethodBeat.i(92867);
    int j = this.eoY.getMode();
    ab.i("MicroMsg.MMAudioManager", "dkbt shiftSpeaker:%b -> %b  %s", new Object[] { Boolean.valueOf(KU()), Boolean.valueOf(paramBoolean1), KT() });
    if (ax.Ex())
    {
      ab.v("MicroMsg.MMAudioManager", "shiftSpeaker return when calling Mode:%d blue:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(this.eoZ) });
      AppMethodBeat.o(92867);
      paramBoolean1 = false;
      return paramBoolean1;
    }
    if ((!paramBoolean3) && ((KP()) || (epc)))
    {
      ab.i("MicroMsg.MMAudioManager", "dkbt shiftSpeaker isBluetoothOn");
      if (!paramBoolean2)
        setMode(0);
      while (true)
      {
        AppMethodBeat.o(92867);
        paramBoolean1 = false;
        break;
        ab.d("MicroMsg.MMAudioManager", "Bluetooth is on and now is in VoIP , set 3 MODE_IN_COMMUNICATION..");
        setMode(3);
      }
    }
    KZ();
    if (paramBoolean2)
    {
      if (q.etd.epG)
      {
        if (q.etd.Lg())
        {
          if (q.etd.epI >= 0)
            setMode(q.etd.epI);
          while (true)
          {
            if (q.etd.epK > 0)
              setSpeakerphoneOn(paramBoolean1);
            AppMethodBeat.o(92867);
            break;
            if (q.etd.epJ >= 0)
              if (paramBoolean1)
                setMode(0);
              else
                setMode(2);
          }
        }
        if (q.etd.Lh())
        {
          if (paramBoolean1)
          {
            if (q.etd.Lk())
              setSpeakerphoneOn(true);
            if (q.etd.Lj() >= 0)
              setMode(q.etd.Lj());
          }
          while (true)
          {
            AppMethodBeat.o(92867);
            break;
            if (q.etd.Lm())
              setSpeakerphoneOn(false);
            if (q.etd.Ll() >= 0)
              setMode(q.etd.Ll());
          }
        }
      }
    }
    else if ((q.etd.epG) && (q.etd.Li()))
    {
      if (paramBoolean1)
      {
        if (q.etd.Lo())
          setSpeakerphoneOn(true);
        if (q.etd.Ln() >= 0)
          setMode(q.etd.Ln());
      }
      while (true)
      {
        AppMethodBeat.o(92867);
        break;
        if (q.etd.Lq())
          setSpeakerphoneOn(false);
        if (q.etd.Lp() >= 0)
          setMode(q.etd.Lp());
      }
    }
    if (paramBoolean2)
    {
      if (paramBoolean1)
      {
        if (Build.VERSION.SDK_INT < 11)
        {
          label465: if (q.etd.eqg >= 0)
            i = q.etd.eqg;
          ab.d("MicroMsg.MMAudioManager", "voip doShiftSpeaker useSpeakerMode:".concat(String.valueOf(i)));
          if (i != this.eoY.getMode())
            setMode(i);
          if (i != this.eoY.getMode())
          {
            if (this.epf != 0)
              break label570;
            this.epf = 1;
          }
        }
        while (true)
        {
          if (!this.eoY.isSpeakerphoneOn())
            setSpeakerphoneOn(true);
          AppMethodBeat.o(92867);
          break;
          i = 3;
          break label465;
          label570: if (this.epf == 2)
            this.epf = 3;
        }
      }
      if (Build.VERSION.SDK_INT < 11)
      {
        if (q.etn.erU != 1)
          break label850;
        ab.d("MicroMsg.MMAudioManager", "doShiftSpeaker htc usePhoneMode : 0");
        i = 0;
      }
    }
    while (true)
    {
      label615: j = i;
      if (Build.VERSION.SDK_INT >= 11)
      {
        j = i;
        if (com.tencent.mm.compatible.util.l.IN())
        {
          j = i;
          if (2 == q.etn.erV)
            j = 2;
        }
      }
      if (q.etd.eqh >= 0)
        j = q.etd.eqh;
      ab.d("MicroMsg.MMAudioManager", "voip doShiftSpeaker usePhoneMode:".concat(String.valueOf(j)));
      if (j != this.eoY.getMode())
        setMode(j);
      if (j != this.eoY.getMode())
      {
        if (this.epf != 0)
          break label753;
        this.epf = 2;
      }
      while (true)
      {
        if (!this.eoY.isSpeakerphoneOn())
          break label767;
        setSpeakerphoneOn(false);
        break;
        i = 3;
        break label615;
        label753: if (this.epf == 1)
          this.epf = 3;
      }
      label767: break;
      setSpeakerphoneOn(paramBoolean1);
      if (KU() == paramBoolean1)
        break;
      if (paramBoolean1)
      {
        setMode(0);
        break;
      }
      if ((Build.VERSION.SDK_INT >= 11) && (com.tencent.mm.compatible.util.l.IN()) && (2 != q.etn.erV))
      {
        setMode(3);
        break;
      }
      if (Build.VERSION.SDK_INT >= 11)
      {
        setMode(3);
        break;
      }
      setMode(2);
      break;
      label850: i = 2;
    }
  }

  public final int getStreamMaxVolume(int paramInt)
  {
    AppMethodBeat.i(92880);
    if (this.eoY != null)
    {
      paramInt = this.eoY.getStreamMaxVolume(paramInt);
      AppMethodBeat.o(92880);
    }
    while (true)
    {
      return paramInt;
      paramInt = 5;
      AppMethodBeat.o(92880);
    }
  }

  public final int getStreamVolume(int paramInt)
  {
    AppMethodBeat.i(92881);
    if (this.eoY != null)
    {
      paramInt = this.eoY.getStreamVolume(paramInt);
      AppMethodBeat.o(92881);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(92881);
    }
  }

  public final void iI(int paramInt)
  {
    AppMethodBeat.i(92855);
    ab.i("MicroMsg.MMAudioManager", "notify, new status: %d, current status: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.eoZ) });
    Iterator localIterator = this.epg.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).gE(paramInt);
    AppMethodBeat.o(92855);
  }

  public final void iJ(int paramInt)
  {
    AppMethodBeat.i(92872);
    if (this.eoY != null)
      a.a(this.eoY, paramInt, 1);
    AppMethodBeat.o(92872);
  }

  public final void iK(int paramInt)
  {
    AppMethodBeat.i(92873);
    if (this.eoY != null)
      a.a(this.eoY, paramInt, -1);
    AppMethodBeat.o(92873);
  }

  public final void setMode(int paramInt)
  {
    AppMethodBeat.i(92878);
    if (this.eoY != null)
    {
      ab.i("MicroMsg.MMAudioManager", "set mode from %d to %d", new Object[] { Integer.valueOf(this.eoY.getMode()), Integer.valueOf(paramInt) });
      this.eoY.setMode(paramInt);
    }
    AppMethodBeat.o(92878);
  }

  public final void setSpeakerphoneOn(boolean paramBoolean)
  {
    AppMethodBeat.i(92879);
    ab.c("MicroMsg.MMAudioManager", "setSpeakerphoneOn, on: ".concat(String.valueOf(paramBoolean)), new Object[0]);
    if (this.eoY != null)
      ab.i("MicroMsg.MMAudioManager", "setSpeakerphoneOn on: ".concat(String.valueOf(paramBoolean)));
    while (true)
    {
      try
      {
        this.eoY.setSpeakerphoneOn(paramBoolean);
        AppMethodBeat.o(92879);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(92879);
    }
  }

  public static abstract interface a
  {
    public abstract void gE(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.g
 * JD-Core Version:    0.6.2
 */