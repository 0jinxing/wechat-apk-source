package com.google.android.gms.internal.wearable;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@VisibleForTesting
public final class zze
{
  public static zzf zza(DataMap paramDataMap)
  {
    AppMethodBeat.i(70674);
    zzg localzzg = new zzg();
    ArrayList localArrayList = new ArrayList();
    Object localObject = new TreeSet(paramDataMap.keySet());
    zzh[] arrayOfzzh = new zzh[((TreeSet)localObject).size()];
    Iterator localIterator = ((TreeSet)localObject).iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      String str = (String)localIterator.next();
      localObject = paramDataMap.get(str);
      arrayOfzzh[i] = new zzh();
      arrayOfzzh[i].name = str;
      arrayOfzzh[i].zzga = zza(localArrayList, localObject);
    }
    localzzg.zzfy = arrayOfzzh;
    paramDataMap = new zzf(localzzg, localArrayList);
    AppMethodBeat.o(70674);
    return paramDataMap;
  }

  private static zzi zza(List<Asset> paramList, Object paramObject)
  {
    AppMethodBeat.i(70676);
    zzi localzzi1 = new zzi();
    if (paramObject == null)
    {
      localzzi1.type = 14;
      AppMethodBeat.o(70676);
      return localzzi1;
    }
    localzzi1.zzgc = new zzj();
    if ((paramObject instanceof String))
    {
      localzzi1.type = 2;
      localzzi1.zzgc.zzge = ((String)paramObject);
    }
    Object localObject1;
    Object localObject2;
    int i;
    Object localObject3;
    while (true)
    {
      AppMethodBeat.o(70676);
      break;
      if ((paramObject instanceof Integer))
      {
        localzzi1.type = 6;
        localzzi1.zzgc.zzgi = ((Integer)paramObject).intValue();
      }
      else if ((paramObject instanceof Long))
      {
        localzzi1.type = 5;
        localzzi1.zzgc.zzgh = ((Long)paramObject).longValue();
      }
      else if ((paramObject instanceof Double))
      {
        localzzi1.type = 3;
        localzzi1.zzgc.zzgf = ((Double)paramObject).doubleValue();
      }
      else if ((paramObject instanceof Float))
      {
        localzzi1.type = 4;
        localzzi1.zzgc.zzgg = ((Float)paramObject).floatValue();
      }
      else if ((paramObject instanceof Boolean))
      {
        localzzi1.type = 8;
        localzzi1.zzgc.zzgk = ((Boolean)paramObject).booleanValue();
      }
      else if ((paramObject instanceof Byte))
      {
        localzzi1.type = 7;
        localzzi1.zzgc.zzgj = ((Byte)paramObject).byteValue();
      }
      else if ((paramObject instanceof byte[]))
      {
        localzzi1.type = 1;
        localzzi1.zzgc.zzgd = ((byte[])paramObject);
      }
      else if ((paramObject instanceof String[]))
      {
        localzzi1.type = 11;
        localzzi1.zzgc.zzgn = ((String[])paramObject);
      }
      else if ((paramObject instanceof long[]))
      {
        localzzi1.type = 12;
        localzzi1.zzgc.zzgo = ((long[])paramObject);
      }
      else if ((paramObject instanceof float[]))
      {
        localzzi1.type = 15;
        localzzi1.zzgc.zzgp = ((float[])paramObject);
      }
      else if ((paramObject instanceof Asset))
      {
        localzzi1.type = 13;
        localObject1 = localzzi1.zzgc;
        paramList.add((Asset)paramObject);
        ((zzj)localObject1).zzgq = (paramList.size() - 1);
      }
      else
      {
        if (!(paramObject instanceof DataMap))
          break label527;
        localzzi1.type = 9;
        localObject1 = (DataMap)paramObject;
        localObject2 = new TreeSet(((DataMap)localObject1).keySet());
        paramObject = new zzh[((TreeSet)localObject2).size()];
        localObject2 = ((TreeSet)localObject2).iterator();
        for (i = 0; ((Iterator)localObject2).hasNext(); i++)
        {
          localObject3 = (String)((Iterator)localObject2).next();
          paramObject[i] = new zzh();
          paramObject[i].name = ((String)localObject3);
          paramObject[i].zzga = zza(paramList, ((DataMap)localObject1).get((String)localObject3));
        }
        localzzi1.zzgc.zzgl = paramObject;
      }
    }
    label527: int k;
    label572: zzi localzzi2;
    if ((paramObject instanceof ArrayList))
    {
      localzzi1.type = 10;
      localObject2 = (ArrayList)paramObject;
      localObject3 = new zzi[((ArrayList)localObject2).size()];
      paramObject = null;
      int j = ((ArrayList)localObject2).size();
      i = 0;
      k = 14;
      if (i < j)
      {
        localObject1 = ((ArrayList)localObject2).get(i);
        localzzi2 = zza(paramList, localObject1);
        if ((localzzi2.type != 14) && (localzzi2.type != 2) && (localzzi2.type != 6) && (localzzi2.type != 9))
        {
          paramList = String.valueOf(localObject1.getClass());
          paramList = new IllegalArgumentException(String.valueOf(paramList).length() + 130 + "The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + paramList);
          AppMethodBeat.o(70676);
          throw paramList;
        }
        if ((k == 14) && (localzzi2.type != 14))
        {
          k = localzzi2.type;
          paramObject = localObject1;
        }
      }
    }
    while (true)
    {
      localObject3[i] = localzzi2;
      i++;
      break label572;
      if (localzzi2.type != k)
      {
        paramList = String.valueOf(paramObject.getClass());
        paramObject = String.valueOf(localObject1.getClass());
        paramList = new IllegalArgumentException(String.valueOf(paramList).length() + 80 + String.valueOf(paramObject).length() + "ArrayList elements must all be of the sameclass, but this one contains a " + paramList + " and a " + paramObject);
        AppMethodBeat.o(70676);
        throw paramList;
        localzzi1.zzgc.zzgm = ((zzi[])localObject3);
        break;
        paramList = String.valueOf(paramObject.getClass().getSimpleName());
        if (paramList.length() != 0);
        for (paramList = "newFieldValueFromValue: unexpected value ".concat(paramList); ; paramList = new String("newFieldValueFromValue: unexpected value "))
        {
          paramList = new RuntimeException(paramList);
          AppMethodBeat.o(70676);
          throw paramList;
        }
      }
    }
  }

  public static DataMap zza(zzf paramzzf)
  {
    AppMethodBeat.i(70675);
    DataMap localDataMap = new DataMap();
    for (zzh localzzh : paramzzf.zzfw.zzfy)
      zza(paramzzf.zzfx, localDataMap, localzzh.name, localzzh.zzga);
    AppMethodBeat.o(70675);
    return localDataMap;
  }

  private static void zza(List<Asset> paramList, DataMap paramDataMap, String paramString, zzi paramzzi)
  {
    AppMethodBeat.i(70677);
    int i = paramzzi.type;
    if (i == 14)
    {
      paramDataMap.putString(paramString, null);
      AppMethodBeat.o(70677);
    }
    while (true)
    {
      return;
      Object localObject1 = paramzzi.zzgc;
      if (i == 1)
      {
        paramDataMap.putByteArray(paramString, ((zzj)localObject1).zzgd);
        AppMethodBeat.o(70677);
      }
      else if (i == 11)
      {
        paramDataMap.putStringArray(paramString, ((zzj)localObject1).zzgn);
        AppMethodBeat.o(70677);
      }
      else if (i == 12)
      {
        paramDataMap.putLongArray(paramString, ((zzj)localObject1).zzgo);
        AppMethodBeat.o(70677);
      }
      else if (i == 15)
      {
        paramDataMap.putFloatArray(paramString, ((zzj)localObject1).zzgp);
        AppMethodBeat.o(70677);
      }
      else if (i == 2)
      {
        paramDataMap.putString(paramString, ((zzj)localObject1).zzge);
        AppMethodBeat.o(70677);
      }
      else if (i == 3)
      {
        paramDataMap.putDouble(paramString, ((zzj)localObject1).zzgf);
        AppMethodBeat.o(70677);
      }
      else if (i == 4)
      {
        paramDataMap.putFloat(paramString, ((zzj)localObject1).zzgg);
        AppMethodBeat.o(70677);
      }
      else if (i == 5)
      {
        paramDataMap.putLong(paramString, ((zzj)localObject1).zzgh);
        AppMethodBeat.o(70677);
      }
      else if (i == 6)
      {
        paramDataMap.putInt(paramString, ((zzj)localObject1).zzgi);
        AppMethodBeat.o(70677);
      }
      else if (i == 7)
      {
        paramDataMap.putByte(paramString, (byte)((zzj)localObject1).zzgj);
        AppMethodBeat.o(70677);
      }
      else if (i == 8)
      {
        paramDataMap.putBoolean(paramString, ((zzj)localObject1).zzgk);
        AppMethodBeat.o(70677);
      }
      else if (i == 13)
      {
        if (paramList == null)
        {
          paramList = String.valueOf(paramString);
          if (paramList.length() != 0);
          for (paramList = "populateBundle: unexpected type for: ".concat(paramList); ; paramList = new String("populateBundle: unexpected type for: "))
          {
            paramList = new RuntimeException(paramList);
            AppMethodBeat.o(70677);
            throw paramList;
          }
        }
        paramDataMap.putAsset(paramString, (Asset)paramList.get((int)((zzj)localObject1).zzgq));
        AppMethodBeat.o(70677);
      }
      else if (i == 9)
      {
        paramzzi = new DataMap();
        for (localObject1 : ((zzj)localObject1).zzgl)
          zza(paramList, paramzzi, ((zzh)localObject1).name, ((zzh)localObject1).zzga);
        paramDataMap.putDataMap(paramString, paramzzi);
        AppMethodBeat.o(70677);
      }
      else
      {
        if (i != 10)
          break label1100;
        ??? = ((zzj)localObject1).zzgm;
        i = 14;
        int k = ???.length;
        ??? = 0;
        int m;
        if (??? < k)
        {
          paramzzi = ???[???];
          if (i == 14)
            if ((paramzzi.type == 9) || (paramzzi.type == 2) || (paramzzi.type == 6))
              m = paramzzi.type;
          do
          {
            do
            {
              ???++;
              i = m;
              break;
              m = i;
            }
            while (paramzzi.type == 14);
            i = paramzzi.type;
            paramList = new IllegalArgumentException(String.valueOf(paramString).length() + 48 + "Unexpected TypedValue type: " + i + " for key " + paramString);
            AppMethodBeat.o(70677);
            throw paramList;
            m = i;
          }
          while (paramzzi.type == i);
          ??? = paramzzi.type;
          paramList = new IllegalArgumentException(String.valueOf(paramString).length() + 126 + "The ArrayList elements should all be the same type, but ArrayList with key " + paramString + " contains items of type " + i + " and " + ???);
          AppMethodBeat.o(70677);
          throw paramList;
        }
        paramzzi = new ArrayList(((zzj)localObject1).zzgm.length);
        localObject1 = ((zzj)localObject1).zzgm;
        k = localObject1.length;
        ??? = 0;
        if (??? < k)
        {
          zzh[] arrayOfzzh = localObject1[???];
          if (arrayOfzzh.type == 14)
            paramzzi.add(null);
          while (true)
          {
            ???++;
            break;
            if (i == 9)
            {
              ??? = new DataMap();
              for (zzh localzzh : arrayOfzzh.zzgc.zzgl)
                zza(paramList, (DataMap)???, localzzh.name, localzzh.zzga);
              paramzzi.add(???);
            }
            else if (i == 2)
            {
              paramzzi.add(arrayOfzzh.zzgc.zzge);
            }
            else
            {
              if (i != 6)
                break label935;
              paramzzi.add(Integer.valueOf(arrayOfzzh.zzgc.zzgi));
            }
          }
          label935: paramList = new IllegalArgumentException(39 + "Unexpected typeOfArrayList: " + i);
          AppMethodBeat.o(70677);
          throw paramList;
        }
        if (i == 14)
        {
          paramDataMap.putStringArrayList(paramString, paramzzi);
          AppMethodBeat.o(70677);
        }
        else if (i == 9)
        {
          paramDataMap.putDataMapArrayList(paramString, paramzzi);
          AppMethodBeat.o(70677);
        }
        else if (i == 2)
        {
          paramDataMap.putStringArrayList(paramString, paramzzi);
          AppMethodBeat.o(70677);
        }
        else
        {
          if (i != 6)
            break;
          paramDataMap.putIntegerArrayList(paramString, paramzzi);
          AppMethodBeat.o(70677);
        }
      }
    }
    paramList = new IllegalStateException(39 + "Unexpected typeOfArrayList: " + i);
    AppMethodBeat.o(70677);
    throw paramList;
    label1100: paramList = new RuntimeException(43 + "populateBundle: unexpected type " + i);
    AppMethodBeat.o(70677);
    throw paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zze
 * JD-Core Version:    0.6.2
 */