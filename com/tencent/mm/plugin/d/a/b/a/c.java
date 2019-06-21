package com.tencent.mm.plugin.d.a.b.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@TargetApi(18)
public class c
{
  public static final String TAG;
  private static HashMap<String, Long> jGv;
  private static HashMap<String, Long> jHD;

  static
  {
    AppMethodBeat.i(18467);
    TAG = c.class.getName();
    jGv = new HashMap();
    HashMap localHashMap = new HashMap();
    jHD = localHashMap;
    localHashMap.put(h.jGK, Long.valueOf(1L));
    jHD.put(h.jGL, Long.valueOf(1L));
    jHD.put(h.jGM, Long.valueOf(16L));
    jHD.put(h.jGN, Long.valueOf(16L));
    jHD.put(h.jGO, Long.valueOf(16L));
    jHD.put(h.jGP, Long.valueOf(16L));
    jGv.put(h.jGH, Long.valueOf(0L));
    jGv.put(h.jGQ, Long.valueOf(2L));
    jGv.put(h.jGT, Long.valueOf(4L));
    jGv.put(h.jGX, Long.valueOf(8L));
    AppMethodBeat.o(18467);
  }

  public static long a(BluetoothGattService paramBluetoothGattService)
  {
    long l1 = 0L;
    AppMethodBeat.i(18464);
    if (paramBluetoothGattService == null)
    {
      ab.e(TAG, "service is null");
      AppMethodBeat.o(18464);
    }
    Object localObject;
    while (true)
    {
      return l1;
      localObject = paramBluetoothGattService.getUuid().toString();
      if ((!((String)localObject).equalsIgnoreCase(h.jGH)) || (paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGK)) == null))
        break;
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristics();
      l1 = 0L;
      int i = 0;
      if (i < paramBluetoothGattService.size())
      {
        localObject = ((BluetoothGattCharacteristic)paramBluetoothGattService.get(i)).getUuid().toString();
        localObject = (Long)jHD.get(localObject);
        if (localObject == null);
        for (long l2 = 0L; ; l2 = ((Long)localObject).longValue())
        {
          i++;
          l1 = l2 | l1;
          break;
        }
      }
      ab.d(TAG, "wechat service, profileType = %d", new Object[] { Long.valueOf(l1) });
      AppMethodBeat.o(18464);
    }
    paramBluetoothGattService = (Long)jGv.get(localObject);
    if (paramBluetoothGattService == null);
    while (true)
    {
      ab.d(TAG, "service uuid = %s, profileType = %d", new Object[] { localObject, Long.valueOf(l1) });
      AppMethodBeat.o(18464);
      break;
      l1 = paramBluetoothGattService.longValue();
    }
  }

  public static byte[] a(BluetoothGattCharacteristic paramBluetoothGattCharacteristic, byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(18466);
    if ((paramBluetoothGattCharacteristic == null) || (paramArrayOfByte == null))
    {
      ab.e(TAG, "characteristic or recvData is null");
      paramBluetoothGattCharacteristic = null;
      AppMethodBeat.o(18466);
      return paramBluetoothGattCharacteristic;
    }
    long l = 0L;
    Object localObject1 = paramBluetoothGattCharacteristic.getUuid().toString();
    paramBluetoothGattCharacteristic = paramBluetoothGattCharacteristic.getService();
    label66: Object localObject2;
    if (paramBluetoothGattCharacteristic != null)
    {
      l = a(paramBluetoothGattCharacteristic);
      ab.d(TAG, "recv data. uuid = %s, data = %s", new Object[] { localObject1, com.tencent.mm.plugin.exdevice.j.b.aN(paramArrayOfByte) });
      if ((0L == (1L & l)) || ((!((String)localObject1).equalsIgnoreCase(f.jIf)) && (!((String)localObject1).equalsIgnoreCase(f.jIg))))
        break label516;
      localObject2 = new f();
      if ((paramArrayOfByte.length > 0) && ((paramArrayOfByte[0] & 0x1) != 0))
        break label230;
      ab.e(f.TAG, "pase step data error");
      k = 0;
      label154: if (k == 0)
        break label503;
      paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.bQ(localObject2);
      ab.d(TAG, "step info. stepCount=%d, stepDistance=%d, stepColarie=%d", new Object[] { Integer.valueOf(((f)localObject2).jIh), Integer.valueOf(((f)localObject2).jIi), Integer.valueOf(((f)localObject2).jIj) });
    }
    while (true)
    {
      AppMethodBeat.o(18466);
      break;
      ab.e(TAG, "the characteristic has no parent service");
      break label66;
      label230: if ((localObject1 == null) || ((!((String)localObject1).equals(f.jIf)) && (!((String)localObject1).equals(f.jIg))))
      {
        ab.e(f.TAG, "uuid is not correct");
        k = 0;
        break label154;
      }
      ((f)localObject2).jHc = ((String)localObject1);
      k = 4;
      if ((paramArrayOfByte[0] & 0x2) != 0)
        k = 7;
      i = k;
      if ((paramArrayOfByte[0] & 0x4) != 0)
        i = k + 3;
      if (i > paramArrayOfByte.length)
      {
        ab.e(f.TAG, "data len is not enough");
        k = 0;
        break label154;
      }
      ((f)localObject2).jIh = 0;
      i = 0;
      k = 1;
      while (i < 3)
      {
        ((f)localObject2).jIh += ((paramArrayOfByte[k] & 0xFF) << i * 8);
        k++;
        i++;
      }
      i = k;
      if ((paramArrayOfByte[0] & 0x2) != 0)
      {
        ((f)localObject2).jIi = 0;
        for (j = 0; ; j++)
        {
          i = k;
          if (j >= 3)
            break;
          ((f)localObject2).jIi += ((paramArrayOfByte[k] & 0xFF) << j * 8);
          k++;
        }
      }
      if ((paramArrayOfByte[0] & 0x4) != 0)
      {
        ((f)localObject2).jIj = 0;
        j = 0;
        k = i;
        for (i = j; i < 3; i++)
        {
          ((f)localObject2).jIj += ((paramArrayOfByte[k] & 0xFF) << i * 8);
          k++;
        }
      }
      k = 1;
      break label154;
      label503: ab.e(TAG, "parse step data error");
      paramBluetoothGattCharacteristic = null;
    }
    label516: label591: boolean bool;
    if ((0L != (0x2 & l)) && ((((String)localObject1).equalsIgnoreCase(g.jGS)) || (((String)localObject1).equalsIgnoreCase(g.jGR))))
    {
      localObject2 = new g();
      if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        ab.e(g.TAG, "characteristicUuid or data is null or nil");
        k = 0;
      }
      while (true)
        if (k != 0)
        {
          paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.bQ(localObject2);
          ab.d(TAG, "weight info. weight = %d", new Object[] { Integer.valueOf(((g)localObject2).jIn.GO) });
          break;
          ((g)localObject2).jHc = ((String)localObject1);
          if (((g)localObject2).jHc.equalsIgnoreCase(g.jGR))
          {
            if (4 > paramArrayOfByte.length)
            {
              ab.e(g.TAG, "weight scale feature characteristic data is a 32bit value, but current value len is %d", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
              k = 0;
            }
            else
            {
              ((g)localObject2).jIm = new g.c();
              paramBluetoothGattCharacteristic = ((g)localObject2).jIm;
              if ((paramArrayOfByte[0] & 0x1) != 0)
              {
                bool = true;
                paramBluetoothGattCharacteristic.jIr = bool;
                paramBluetoothGattCharacteristic = ((g)localObject2).jIm;
                if ((paramArrayOfByte[0] & 0x2) == 0)
                  break label927;
                bool = true;
                paramBluetoothGattCharacteristic.jIs = bool;
                paramBluetoothGattCharacteristic = ((g)localObject2).jIm;
                if ((paramArrayOfByte[0] & 0x4) == 0)
                  break label933;
                bool = true;
                paramBluetoothGattCharacteristic.jIt = bool;
                ((g)localObject2).jIm.jIu = ((byte)(byte)((paramArrayOfByte[0] & 0x78) >> 3));
                ((g)localObject2).jIm.jIv = ((byte)(byte)(((paramArrayOfByte[0] & 0x80) >> 7) + ((paramArrayOfByte[1] & 0x3) << 1)));
                str = g.TAG;
                if (!((g)localObject2).jIm.jIr)
                  break label939;
                paramBluetoothGattCharacteristic = "true";
                if (!((g)localObject2).jIm.jIs)
                  break label946;
                paramArrayOfByte = "true";
                if (!((g)localObject2).jIm.jIt)
                  break label953;
                localObject1 = "true";
                ab.d(str, "timestampSupported = %s, multipleUsersSupported = %s, BMISupported = %s, weightResolution = %d, heightResolution = %d", new Object[] { paramBluetoothGattCharacteristic, paramArrayOfByte, localObject1, Byte.valueOf(((g)localObject2).jIm.jIu), Byte.valueOf(((g)localObject2).jIm.jIv) });
              }
            }
          }
          else
          {
            label927: label933: label939: label946: label953: 
            while (!((g)localObject2).jHc.equalsIgnoreCase(g.jGS))
              while (true)
              {
                String str;
                k = 1;
                break;
                bool = false;
                continue;
                bool = false;
                continue;
                bool = false;
                continue;
                paramBluetoothGattCharacteristic = "false";
                continue;
                paramArrayOfByte = "false";
                continue;
                localObject1 = "false";
              }
            j = paramArrayOfByte[0];
            if ((j & 0x2) == 0)
              break label3974;
          }
        }
    }
    label1084: label1341: for (i = 10; ; i = 3)
    {
      k = i;
      if ((j & 0x4) != 0)
        k = i + 1;
      i = k;
      if ((j & 0x8) != 0)
        i = k + 4;
      if (i > paramArrayOfByte.length)
      {
        ab.e(g.TAG, "data len is not enough for parse. current len = %d, needed len = %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(i) });
        k = 0;
        break label591;
      }
      ((g)localObject2).jIn = new g.b();
      paramBluetoothGattCharacteristic = ((g)localObject2).jIn;
      if ((j & 0x1) != 0)
      {
        bool = true;
        paramBluetoothGattCharacteristic.jIo = bool;
        ((g)localObject2).jIn.GO = ((paramArrayOfByte[1] & 0xFF) + ((paramArrayOfByte[2] & 0xFF) << 8));
        if ((j & 0x2) == 0)
          break label3968;
        ((g)localObject2).jIn.jIp = new g.a();
        paramBluetoothGattCharacteristic = ((g)localObject2).jIn.jIp;
        localObject1 = g.TAG;
        if (paramArrayOfByte != null)
          break label1446;
        k = 0;
        ab.d((String)localObject1, "data size = %d, offset = %d, lenght = %d", new Object[] { Integer.valueOf(k), Integer.valueOf(3), Integer.valueOf(7) });
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 10))
          break label1453;
        ab.e(g.TAG, "data input error");
      }
      label1213: for (k = 10; ; k = 3)
      {
        i = k;
        if ((j & 0x4) != 0)
        {
          ((g)localObject2).jIn.jHs = (paramArrayOfByte[k] & 0xFF);
          i = k + 1;
        }
        if ((j & 0x8) != 0)
        {
          ((g)localObject2).jIn.jIq = ((paramArrayOfByte[i] & 0xFF) + ((paramArrayOfByte[(i + 1)] & 0xFF) << 8));
          k = i + 2;
          paramBluetoothGattCharacteristic = ((g)localObject2).jIn;
          i = paramArrayOfByte[k];
          paramBluetoothGattCharacteristic.mHeight = (((paramArrayOfByte[(k + 1)] & 0xFF) << 8) + (i & 0xFF));
        }
        localObject1 = g.TAG;
        if (((g)localObject2).jIn.jIo)
        {
          paramBluetoothGattCharacteristic = "lb&inch";
          k = ((g)localObject2).jIn.GO;
          if (((g)localObject2).jIn.jIp != null)
            break label1618;
        }
        label1618: for (paramArrayOfByte = "null"; ; paramArrayOfByte = "object")
        {
          ab.d((String)localObject1, "WeightAndHeightUnit = %s, Weight = %d, TimeStamp = %s, UserId = %d, BMI = %d, Height = %d", new Object[] { paramBluetoothGattCharacteristic, Integer.valueOf(k), paramArrayOfByte, Integer.valueOf(((g)localObject2).jIn.jHs), Integer.valueOf(((g)localObject2).jIn.jIq), Integer.valueOf(((g)localObject2).jIn.mHeight) });
          break;
          bool = false;
          break label1084;
          k = paramArrayOfByte.length;
          break label1158;
          paramBluetoothGattCharacteristic.enV = ((paramArrayOfByte[3] & 0xFF) + ((paramArrayOfByte[4] & 0xFF) << 8));
          paramBluetoothGattCharacteristic.enR = (paramArrayOfByte[5] & 0xFF);
          paramBluetoothGattCharacteristic.jHz = (paramArrayOfByte[6] & 0xFF);
          paramBluetoothGattCharacteristic.jHA = (paramArrayOfByte[7] & 0xFF);
          paramBluetoothGattCharacteristic.jHB = (paramArrayOfByte[8] & 0xFF);
          paramBluetoothGattCharacteristic.jHC = (paramArrayOfByte[9] & 0xFF);
          ab.d(g.TAG, "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", new Object[] { Integer.valueOf(paramBluetoothGattCharacteristic.enV), Integer.valueOf(paramBluetoothGattCharacteristic.enR), Integer.valueOf(paramBluetoothGattCharacteristic.jHz), Integer.valueOf(paramBluetoothGattCharacteristic.jHA), Integer.valueOf(paramBluetoothGattCharacteristic.jHB), Integer.valueOf(paramBluetoothGattCharacteristic.jHC) });
          break label1213;
          paramBluetoothGattCharacteristic = "kg&meter";
          break label1341;
        }
        ab.e(TAG, "parse weight scale data error");
        paramBluetoothGattCharacteristic = null;
        break;
        int m;
        if ((0L != (0x4 & l)) && ((((String)localObject1).equalsIgnoreCase(d.jHe)) || (((String)localObject1).equalsIgnoreCase(d.jHE)) || (((String)localObject1).equalsIgnoreCase(d.jHF))))
        {
          paramBluetoothGattCharacteristic = new d();
          if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null))
            ab.e(d.TAG, "characteristicUuid or data is null");
          while (true)
            if (k != 0)
            {
              paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.bQ(paramBluetoothGattCharacteristic);
              break;
              paramBluetoothGattCharacteristic.jHc = ((String)localObject1);
              m = paramArrayOfByte.length;
              if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(d.jHe))
              {
                if (paramArrayOfByte.length < 2)
                {
                  ab.e(d.TAG, "Received data length is not right:".concat(String.valueOf(m)));
                }
                else
                {
                  paramBluetoothGattCharacteristic.jHM = new d.a(paramBluetoothGattCharacteristic);
                  j = paramArrayOfByte[0];
                  ab.d(d.TAG, "flag=".concat(String.valueOf(j)));
                  if (((j & 0x1) == 1) && (m >= 3))
                  {
                    ab.d(d.TAG, "Value Format = uint16");
                    k = paramArrayOfByte[2];
                    paramBluetoothGattCharacteristic.jHM.jHN = ((k << 8 & 0xFF00 & 0xFF00) + (paramArrayOfByte[1] & 0xFF));
                    k = 3;
                    ab.v(d.TAG, "Data received from HR " + paramBluetoothGattCharacteristic.jHM.jHN);
                    if ((j & 0x6) != 4)
                      break label2189;
                    ab.d(d.TAG, "Sensor Contact feature is supported, but contact is not detected");
                    paramBluetoothGattCharacteristic.jHM.jHO = 1;
                    i = k;
                    if ((j & 0x8) == 8)
                    {
                      i = k;
                      if (m >= k + 2)
                      {
                        ab.d(d.TAG, "Energy Expend Present");
                        i = paramArrayOfByte[(k + 1)] << 8 & 0xFF00;
                        paramBluetoothGattCharacteristic.jHM.jHP = ((paramArrayOfByte[k] & 0xFF) + (i & 0xFF00));
                        ab.v("H7ConnectThread", "energyExp from HR energyExph " + i + " " + paramBluetoothGattCharacteristic.jHM.jHP);
                        i = k + 2;
                      }
                    }
                    if (((j & 0x10) == 16) && (m >= i + 2))
                    {
                      ab.d(d.TAG, "RR Interval Present");
                      k = (paramArrayOfByte[(i + 1)] & 0xFF) << 8;
                      paramBluetoothGattCharacteristic.jHM.jHQ = ((paramArrayOfByte[i] & 0xFF) + (k & 0xFF00));
                      ab.v(d.TAG, "rrInterval from HR rrIntervalh" + k + " " + paramBluetoothGattCharacteristic.jHM.jHQ);
                    }
                  }
                }
              }
              else
              {
                while (!paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(d.jHE))
                  while (true)
                  {
                    k = 1;
                    break;
                    if (m >= 2)
                    {
                      ab.d(d.TAG, "Value Format = uint8");
                      paramBluetoothGattCharacteristic.jHM.jHN = (paramArrayOfByte[1] & 0xFF);
                      k = 2;
                    }
                    else
                    {
                      ab.d(d.TAG, "receive data error");
                      break;
                      if ((j & 0x6) == 6)
                      {
                        ab.d(d.TAG, "Sensor Contact feature is supported and contact is detected");
                        paramBluetoothGattCharacteristic.jHM.jHO = 2;
                      }
                      else
                      {
                        ab.d(d.TAG, "Sensor Contact feature is not supported in the current connection");
                        paramBluetoothGattCharacteristic.jHM.jHO = 0;
                      }
                    }
                  }
                switch (paramArrayOfByte[0])
                {
                default:
                  paramBluetoothGattCharacteristic.jHL = "Unknown";
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                }
                while (true)
                {
                  ab.d(d.TAG, "position=" + paramBluetoothGattCharacteristic.jHL);
                  break;
                  paramBluetoothGattCharacteristic.jHL = "Other";
                  continue;
                  paramBluetoothGattCharacteristic.jHL = "Chest";
                  continue;
                  paramBluetoothGattCharacteristic.jHL = "Wrist";
                  continue;
                  paramBluetoothGattCharacteristic.jHL = "Finger";
                  continue;
                  paramBluetoothGattCharacteristic.jHL = "Hand";
                  continue;
                  paramBluetoothGattCharacteristic.jHL = "Ear Lobe";
                  continue;
                  paramBluetoothGattCharacteristic.jHL = "Foot";
                }
              }
            }
          ab.e(TAG, "parse heart rate data error");
          paramBluetoothGattCharacteristic = null;
          break;
        }
        if ((0L != (0x8 & l)) && ((((String)localObject1).equalsIgnoreCase(b.jHe)) || (((String)localObject1).equalsIgnoreCase(b.jHf)) || (((String)localObject1).equalsIgnoreCase(b.jHg))))
        {
          paramBluetoothGattCharacteristic = new b();
          if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null))
          {
            ab.e(b.TAG, "characteristicUuid or data is null");
            k = i;
          }
          while (true)
            if (k != 0)
            {
              paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.bQ(paramBluetoothGattCharacteristic);
              break;
              paramBluetoothGattCharacteristic.jHc = ((String)localObject1);
              m = paramArrayOfByte.length;
              if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(b.jHe))
              {
                if (m < 7)
                {
                  ab.e(b.TAG, "data len is not right.");
                  k = i;
                }
                else
                {
                  paramBluetoothGattCharacteristic.jHm = new b.b(paramBluetoothGattCharacteristic);
                  j = paramArrayOfByte[0];
                  ab.d(b.TAG, "flag=".concat(String.valueOf(j)));
                  if ((j & 0x1) != 0)
                  {
                    ab.d(b.TAG, "the value unit is kPa.");
                    paramBluetoothGattCharacteristic.jHm.jHp = true;
                    paramBluetoothGattCharacteristic.jHm.jHw = b.L(paramArrayOfByte, 1);
                    paramBluetoothGattCharacteristic.jHm.jHx = b.L(paramArrayOfByte, 3);
                    paramBluetoothGattCharacteristic.jHm.jHy = b.L(paramArrayOfByte, 5);
                    k = 7;
                    if (((j & 0x2) == 0) || (m < 14))
                      break label2934;
                    ab.d(b.TAG, "TimeStamp Present.");
                    paramBluetoothGattCharacteristic.jHm.jHu.M(paramArrayOfByte, 7);
                    k = 14;
                    if (((j & 0x4) == 0) || (m < k + 2))
                      break label2946;
                    ab.d(b.TAG, "PulseRate Present.");
                    paramBluetoothGattCharacteristic.jHm.jHr = ((int)b.L(paramArrayOfByte, k));
                    k += 2;
                    ab.d(b.TAG, "PulseRate =" + paramBluetoothGattCharacteristic.jHm.jHr);
                    label2760: if ((j & 0x8) == 0)
                      break label2958;
                    ab.d(b.TAG, "UserId Present.");
                    localObject1 = paramBluetoothGattCharacteristic.jHm;
                    i = k + 1;
                    ((b.b)localObject1).jHs = paramArrayOfByte[k];
                    ab.d(b.TAG, "UserId = " + paramBluetoothGattCharacteristic.jHm.jHs);
                    k = i;
                    if ((j & 0x10) == 0)
                      break label2970;
                    ab.d(b.TAG, "MeasurementStatus Present.");
                    i = paramArrayOfByte[(k + 1)];
                    paramBluetoothGattCharacteristic.jHm.jHt = ((paramArrayOfByte[k] & 0xFF) + (i << 8 & 0xFF00 & 0xFF00));
                    ab.d(b.TAG, "MeasurementStatus = " + paramBluetoothGattCharacteristic.jHm.jHt);
                  }
                }
              }
              else
                while (true)
                {
                  k = 1;
                  break;
                  ab.d(b.TAG, "the value unit is mmHg.");
                  paramBluetoothGattCharacteristic.jHm.jHp = false;
                  break label2610;
                  label2934: ab.d(b.TAG, "TimeStamp not Present.");
                  break label2690;
                  ab.d(b.TAG, "PulseRate not Present.");
                  break label2760;
                  ab.d(b.TAG, "UserId not Present.");
                  break label2828;
                  ab.d(b.TAG, "MeasurementStatus not Present.");
                  continue;
                  if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(b.jHf))
                  {
                    if (m < 3)
                    {
                      ab.e(b.TAG, "data len is not right.");
                      k = i;
                      break;
                    }
                    paramBluetoothGattCharacteristic.jHn = new b.a(paramBluetoothGattCharacteristic);
                    j = paramArrayOfByte[0];
                    ab.d(b.TAG, "flag=".concat(String.valueOf(j)));
                    if ((j & 0x1) != 0)
                    {
                      ab.d(b.TAG, "the value unit is kPa.");
                      paramBluetoothGattCharacteristic.jHn.jHp = true;
                      label3071: paramBluetoothGattCharacteristic.jHn.jHq = b.L(paramArrayOfByte, 1);
                      if (((j & 0x2) == 0) || (m < 10))
                        break label3363;
                      ab.d(b.TAG, "TimeStamp Present.");
                      paramBluetoothGattCharacteristic.jHn.jHu.M(paramArrayOfByte, 3);
                      k = 10;
                      if (((j & 0x4) == 0) || (m < k + 2))
                        break label3378;
                      ab.d(b.TAG, "PulseRate Present.");
                      paramBluetoothGattCharacteristic.jHn.jHr = ((int)b.L(paramArrayOfByte, k));
                      k += 2;
                      ab.d(b.TAG, "PulseRate =" + paramBluetoothGattCharacteristic.jHn.jHr);
                      label3192: if ((j & 0x8) == 0)
                        break label3390;
                      ab.d(b.TAG, "UserId Present.");
                      localObject1 = paramBluetoothGattCharacteristic.jHn;
                      i = k + 1;
                      ((b.a)localObject1).jHs = paramArrayOfByte[k];
                      ab.d(b.TAG, "UserId = " + paramBluetoothGattCharacteristic.jHn.jHs);
                      k = i;
                    }
                    while (true)
                    {
                      if ((j & 0x10) == 0)
                        break label3402;
                      ab.d(b.TAG, "MeasurementStatus Present.");
                      i = paramArrayOfByte[(k + 1)];
                      paramBluetoothGattCharacteristic.jHn.jHt = ((paramArrayOfByte[k] & 0xFF) + (i << 8 & 0xFF00 & 0xFF00));
                      ab.d(b.TAG, "MeasurementStatus = " + paramBluetoothGattCharacteristic.jHn.jHt);
                      break;
                      ab.d(b.TAG, "the value unit is mmHg.");
                      paramBluetoothGattCharacteristic.jHn.jHp = false;
                      break label3071;
                      ab.d(b.TAG, "TimeStamp not Present.");
                      k = 3;
                      break label3122;
                      ab.d(b.TAG, "PulseRate not Present.");
                      break label3192;
                      label3390: ab.d(b.TAG, "UserId not Present.");
                    }
                    label3402: ab.d(b.TAG, "MeasurementStatus not Present.");
                    continue;
                  }
                  if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(b.jHg))
                  {
                    ab.d(b.TAG, "Blood Pressure Feature Characteristic.");
                    if (m < 2)
                    {
                      ab.e(b.TAG, "data len is not right.");
                      k = i;
                      break;
                    }
                    paramBluetoothGattCharacteristic.jHo = ((paramArrayOfByte[1] << 8 & 0xFF00 & 0xFF00) + (paramArrayOfByte[0] & 0xFF));
                    ab.d(b.TAG, "bloodPressureFeatureParameters=" + paramBluetoothGattCharacteristic.jHo);
                  }
                }
            }
          ab.e(TAG, "parse blood pressure data error");
          paramBluetoothGattCharacteristic = null;
          break;
        }
        if ((0L != (l & 0x10)) && ((((String)localObject1).equalsIgnoreCase(e.jHS)) || (((String)localObject1).equalsIgnoreCase(e.jHT)) || (((String)localObject1).equalsIgnoreCase(e.jHU)) || (((String)localObject1).equalsIgnoreCase(e.jHV))))
        {
          paramBluetoothGattCharacteristic = new e();
          if ((localObject1 == null) || (((String)localObject1).length() <= 0) || (paramArrayOfByte == null))
          {
            ab.e(e.TAG, "characteristicUuid or data is null");
            k = j;
          }
          while (true)
          {
            if (k == 0)
              break label3931;
            paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.bQ(paramBluetoothGattCharacteristic);
            break;
            paramBluetoothGattCharacteristic.jHc = ((String)localObject1);
            if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(e.jHS))
            {
              if (paramArrayOfByte.length != 3)
              {
                ab.e(e.TAG, "Data length incorrect");
                k = j;
              }
              else
              {
                paramBluetoothGattCharacteristic.jHW = ((byte)paramArrayOfByte[0]);
                paramBluetoothGattCharacteristic.jHX = ((byte)paramArrayOfByte[1]);
                paramBluetoothGattCharacteristic.jHY = ((byte)paramArrayOfByte[2]);
              }
            }
            else
            {
              while (true)
              {
                k = 1;
                break;
                if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(e.jHT))
                {
                  if (paramArrayOfByte.length != 1)
                  {
                    ab.e(e.TAG, "Data length incorrect");
                    k = j;
                    break;
                  }
                  paramBluetoothGattCharacteristic.jHZ = ((byte)paramArrayOfByte[0]);
                  continue;
                }
                if (paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(e.jHU))
                {
                  if (paramArrayOfByte.length < 2)
                  {
                    ab.e(e.TAG, "Data length incorrect");
                    k = j;
                    break;
                  }
                  paramBluetoothGattCharacteristic.jIa[0] = ((byte)paramArrayOfByte[0]);
                  paramBluetoothGattCharacteristic.jIa[1] = ((byte)paramArrayOfByte[1]);
                  continue;
                }
                if (!paramBluetoothGattCharacteristic.jHc.equalsIgnoreCase(e.jHV))
                  break label3916;
                if (paramArrayOfByte.length < 4)
                {
                  ab.e(e.TAG, "Data length incorrect");
                  k = j;
                  break;
                }
                paramBluetoothGattCharacteristic.jIb = ((paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8));
                paramBluetoothGattCharacteristic.jId = ((byte)paramArrayOfByte[2]);
                paramBluetoothGattCharacteristic.jIc = ((byte)paramArrayOfByte[3]);
                if (paramArrayOfByte.length > 4)
                {
                  paramBluetoothGattCharacteristic.jIe = new byte[paramArrayOfByte.length - 4];
                  System.arraycopy(paramArrayOfByte, 4, paramBluetoothGattCharacteristic.jIe, 0, paramArrayOfByte.length - 4);
                }
                else
                {
                  paramBluetoothGattCharacteristic.jIe = null;
                }
              }
              label3916: ab.e(e.TAG, "characteristicUuid is incorrect");
              k = j;
            }
          }
          label3931: ab.e(TAG, "parse light data error");
          paramBluetoothGattCharacteristic = null;
          break;
        }
        ab.e(TAG, "unknown characteristic uuid = %s", new Object[] { localObject1 });
        paramBluetoothGattCharacteristic = null;
        break;
      }
    }
  }

  public static boolean au(byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    AppMethodBeat.i(18462);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e(TAG, "parseBroadcastServiceUuid error. broadcast data is null or nil");
      AppMethodBeat.o(18462);
      return bool1;
    }
    int i = 0;
    label34: int k;
    int n;
    label212: Object localObject;
    while (true)
      if ((i >= 0) && (i < paramArrayOfByte.length))
      {
        int j = i + 1;
        i = paramArrayOfByte[i];
        if (j + i > paramArrayOfByte.length)
        {
          ab.w(TAG, "broadcast data len is not enough. offset = %d, current len = %d, broadcast len = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramArrayOfByte.length) });
          AppMethodBeat.o(18462);
          break;
        }
        if (i <= 0)
        {
          ab.w(TAG, "current part of data's len = %d.", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(18462);
          break;
        }
        k = j + 1;
        int m = paramArrayOfByte[j];
        n = i - 1;
        i = n;
        j = k;
        switch (m)
        {
        case 0:
        case 1:
        case 4:
        case 5:
        default:
          i = n + k;
          break;
        case 2:
        case 3:
          while (true)
            if (2 <= i)
            {
              n = j + 1;
              k = paramArrayOfByte[j];
              j = n + 1;
              n = paramArrayOfByte[n];
              i -= 2;
              localObject = String.format("%08x-0000-1000-8000-00805f9b34fb", new Object[] { Integer.valueOf((n & 0xFF) << 8 | k & 0xFF) });
              ab.d(TAG, "find 16-bit broacast service = %s", new Object[] { localObject });
              if (jGv.containsKey(localObject))
              {
                AppMethodBeat.o(18462);
                bool1 = true;
                break;
              }
            }
          i += j;
          continue;
          label331: k += 16;
          i -= 16;
        case -1:
        case 6:
        case 7:
        }
      }
    while (true)
    {
      while (true)
        if (16 <= i)
          try
          {
            localObject = ByteBuffer.wrap(paramArrayOfByte, k, 16).order(ByteOrder.LITTLE_ENDIAN);
            long l1 = ((ByteBuffer)localObject).getLong();
            long l2 = ((ByteBuffer)localObject).getLong();
            localObject = new java/util/UUID;
            ((UUID)localObject).<init>(l2, l1);
            localObject = ((UUID)localObject).toString();
            ab.d(TAG, "find 128-bit broacast service = %s", new Object[] { localObject });
            boolean bool2 = jGv.containsKey(localObject);
            if (!bool2)
              break label331;
            AppMethodBeat.o(18462);
            bool1 = true;
            break;
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
          {
            ab.e("BlueToothDeviceFilter.parseUUID", localIndexOutOfBoundsException.toString());
            k += 16;
            i -= 16;
          }
          finally
          {
            AppMethodBeat.o(18462);
          }
      i = k + i;
      break label34;
      ab.i(TAG, "Manufacturer Specific Data size = %s", new Object[] { Integer.valueOf(n) });
      ab.i(TAG, "Manufacturer Specific Data = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.aN(Arrays.copyOfRange(paramArrayOfByte, k, k + n)) });
      break label212;
      AppMethodBeat.o(18462);
      break;
      i = n;
    }
  }

  public static boolean b(BluetoothGattService paramBluetoothGattService)
  {
    boolean bool = false;
    AppMethodBeat.i(18465);
    if (paramBluetoothGattService == null)
    {
      ab.e(TAG, "service is null");
      AppMethodBeat.o(18465);
    }
    while (true)
    {
      return bool;
      long l = a(paramBluetoothGattService);
      BluetoothGattCharacteristic localBluetoothGattCharacteristic;
      int i;
      if (0L != (1L & l))
      {
        if (paramBluetoothGattService == null)
        {
          ab.e(TAG, "service is null");
          AppMethodBeat.o(18465);
        }
        else
        {
          localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGK));
          if (localBluetoothGattCharacteristic == null)
          {
            ab.e(TAG, "no step measurement characteristic found");
            AppMethodBeat.o(18465);
          }
          else
          {
            i = localBluetoothGattCharacteristic.getProperties();
            ab.d(TAG, "step measurement characteristic properties = %d", new Object[] { Integer.valueOf(i) });
            if (((i & 0x30) == 0) || ((i & 0x2) == 0))
            {
              ab.e(TAG, "step measurement characteristic has incorrect proterties(%d)", new Object[] { Integer.valueOf(i) });
              AppMethodBeat.o(18465);
            }
            else
            {
              paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGL));
              if (paramBluetoothGattService != null)
              {
                i = paramBluetoothGattService.getProperties();
                if (((i & 0x2) == 0) || ((i & 0x20) == 0))
                {
                  ab.e(TAG, "step target characteristic has incorrect proterties(%d)", new Object[] { Integer.valueOf(i) });
                  AppMethodBeat.o(18465);
                }
              }
              else
              {
                AppMethodBeat.o(18465);
                bool = true;
              }
            }
          }
        }
      }
      else if (0L != (0x2 & l))
      {
        if (paramBluetoothGattService == null)
        {
          ab.e(TAG, "service is null");
          AppMethodBeat.o(18465);
        }
        else
        {
          localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGR));
          if (localBluetoothGattCharacteristic == null)
          {
            ab.e(TAG, "weight scale feature characteristic not found");
            AppMethodBeat.o(18465);
          }
          else
          {
            i = localBluetoothGattCharacteristic.getProperties();
            if ((i & 0x2) == 0)
            {
              ab.e(TAG, "weight scale feature characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
              AppMethodBeat.o(18465);
            }
            else
            {
              paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGS));
              if (paramBluetoothGattService == null)
              {
                ab.e(TAG, "weight measurement characteristic not found");
                AppMethodBeat.o(18465);
              }
              else
              {
                i = paramBluetoothGattService.getProperties();
                if ((i & 0x20) == 0)
                {
                  ab.e(TAG, "weight measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
                  AppMethodBeat.o(18465);
                }
                else
                {
                  AppMethodBeat.o(18465);
                  bool = true;
                }
              }
            }
          }
        }
      }
      else if (0L != (0x4 & l))
      {
        if (paramBluetoothGattService == null)
        {
          ab.e(TAG, "service is null");
          AppMethodBeat.o(18465);
        }
        else
        {
          localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGU));
          if (localBluetoothGattCharacteristic == null)
          {
            ab.e(TAG, "heart rate measurement characteristic not found");
            AppMethodBeat.o(18465);
          }
          else
          {
            i = localBluetoothGattCharacteristic.getProperties();
            if ((i & 0x10) == 0)
            {
              ab.e(TAG, "heart rate measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(16) });
              AppMethodBeat.o(18465);
            }
            else
            {
              localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGV));
              if (localBluetoothGattCharacteristic != null)
              {
                i = localBluetoothGattCharacteristic.getProperties();
                if ((i & 0x2) == 0)
                {
                  ab.e(TAG, "heart rate body sensor location characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
                  AppMethodBeat.o(18465);
                }
              }
              else
              {
                paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGW));
                if (paramBluetoothGattService != null)
                {
                  i = paramBluetoothGattService.getProperties();
                  if ((i & 0x8) == 0)
                  {
                    ab.e(TAG, "heart rate control point characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(8) });
                    AppMethodBeat.o(18465);
                  }
                }
                else
                {
                  AppMethodBeat.o(18465);
                  bool = true;
                }
              }
            }
          }
        }
      }
      else if (0L != (0x8 & l))
      {
        if (paramBluetoothGattService == null)
        {
          ab.e(TAG, "service is null");
          AppMethodBeat.o(18465);
        }
        else
        {
          localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGY));
          if (localBluetoothGattCharacteristic == null)
          {
            ab.e(TAG, "blood pressure measurement characteristic not found");
            AppMethodBeat.o(18465);
          }
          else
          {
            i = localBluetoothGattCharacteristic.getProperties();
            if ((i & 0x20) == 0)
            {
              ab.e(TAG, "blood pressure measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
              AppMethodBeat.o(18465);
            }
            else
            {
              localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jHa));
              if (localBluetoothGattCharacteristic == null)
              {
                ab.e(TAG, "blood pressure feature characteristic not found");
                AppMethodBeat.o(18465);
              }
              else
              {
                i = localBluetoothGattCharacteristic.getProperties();
                if ((i & 0x2) == 0)
                {
                  ab.e(TAG, "blood pressure feature characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
                  AppMethodBeat.o(18465);
                }
                else
                {
                  paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGZ));
                  if (paramBluetoothGattService != null)
                  {
                    i = paramBluetoothGattService.getProperties();
                    if ((i & 0x10) == 0)
                    {
                      ab.e(TAG, "blood pressure intermediate cuff pressure characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(16) });
                      AppMethodBeat.o(18465);
                    }
                  }
                  else
                  {
                    AppMethodBeat.o(18465);
                    bool = true;
                  }
                }
              }
            }
          }
        }
      }
      else if (0L != (l & 0x10))
      {
        if (paramBluetoothGattService == null)
        {
          ab.e(TAG, "service is null");
          AppMethodBeat.o(18465);
        }
        else
        {
          localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGM));
          if (localBluetoothGattCharacteristic == null)
          {
            ab.e(TAG, "light color characteristic not found");
            AppMethodBeat.o(18465);
          }
          else
          {
            i = localBluetoothGattCharacteristic.getProperties();
            if (((i & 0x20) == 0) || ((i & 0x10) == 0) || ((i & 0x2) == 0) || ((i & 0x8) == 0))
            {
              ab.e(TAG, "light color characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
              AppMethodBeat.o(18465);
            }
            else
            {
              localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGN));
              if (localBluetoothGattCharacteristic == null)
              {
                ab.e(TAG, "light work state characteristic not found");
                AppMethodBeat.o(18465);
              }
              else
              {
                i = localBluetoothGattCharacteristic.getProperties();
                if (((i & 0x20) == 0) || ((i & 0x2) == 0) || ((i & 0x8) == 0))
                {
                  ab.e(TAG, "light work state characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
                  AppMethodBeat.o(18465);
                }
                else
                {
                  localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGO));
                  if (localBluetoothGattCharacteristic == null)
                  {
                    ab.e(TAG, "light state changed characteristic not found");
                    AppMethodBeat.o(18465);
                  }
                  else
                  {
                    i = localBluetoothGattCharacteristic.getProperties();
                    if ((i & 0x20) == 0)
                    {
                      ab.e(TAG, "light state changed characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
                      AppMethodBeat.o(18465);
                    }
                    else
                    {
                      paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.jGP));
                      if (paramBluetoothGattService == null)
                      {
                        ab.e(TAG, "control point characteristic not found");
                        AppMethodBeat.o(18465);
                      }
                      else
                      {
                        i = paramBluetoothGattService.getProperties();
                        if (((i & 0x20) == 0) || ((i & 0x8) == 0))
                        {
                          ab.e(TAG, "control point characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
                          AppMethodBeat.o(18465);
                        }
                        else
                        {
                          AppMethodBeat.o(18465);
                          bool = true;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      else
        AppMethodBeat.o(18465);
    }
  }

  public static String gA(long paramLong)
  {
    AppMethodBeat.i(18463);
    Iterator localIterator = jGv.keySet().iterator();
    String str;
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (((Long)jGv.get(str)).longValue() == paramLong)
        AppMethodBeat.o(18463);
    }
    while (true)
    {
      return str;
      if (jHD.containsValue(Long.valueOf(paramLong)))
      {
        str = h.jGH;
        AppMethodBeat.o(18463);
      }
      else
      {
        str = null;
        AppMethodBeat.o(18463);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a.c
 * JD-Core Version:    0.6.2
 */