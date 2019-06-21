package com.tencent.mm.cache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class MCacheItem
  implements Parcelable
{
  public static final Parcelable.Creator<MCacheItem> CREATOR;
  private c efu;

  static
  {
    AppMethodBeat.i(57848);
    CREATOR = new MCacheItem.1();
    AppMethodBeat.o(57848);
  }

  public MCacheItem(Parcel paramParcel)
  {
    AppMethodBeat.i(57845);
    this.efu = c(paramParcel);
    AppMethodBeat.o(57845);
  }

  public MCacheItem(c paramc)
  {
    this.efu = paramc;
  }

  // ERROR //
  private c c(Parcel paramParcel)
  {
    // Byte code:
    //   0: ldc 46
    //   2: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokevirtual 52	android/os/Parcel:readString	()Ljava/lang/String;
    //   9: invokestatic 58	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   12: astore_2
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual 62	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   18: checkcast 64	com/tencent/mm/sdk/e/c
    //   21: putfield 42	com/tencent/mm/cache/MCacheItem:efu	Lcom/tencent/mm/sdk/e/c;
    //   24: aload_2
    //   25: invokestatic 68	com/tencent/mm/sdk/e/c:ax	(Ljava/lang/Class;)Lcom/tencent/mm/sdk/e/c$a;
    //   28: getfield 74	com/tencent/mm/sdk/e/c$a:xDb	[Ljava/lang/reflect/Field;
    //   31: astore_2
    //   32: aload_2
    //   33: arraylength
    //   34: istore_3
    //   35: iconst_0
    //   36: istore 4
    //   38: iload 4
    //   40: iload_3
    //   41: if_icmpge +117 -> 158
    //   44: aload_2
    //   45: iload 4
    //   47: aaload
    //   48: astore 5
    //   50: getstatic 78	com/tencent/mm/cache/MCacheItem$a:efw	Ljava/util/Map;
    //   53: aload 5
    //   55: invokevirtual 84	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   58: invokeinterface 90 2 0
    //   63: checkcast 92	java/lang/reflect/Method
    //   66: astore 6
    //   68: aload 6
    //   70: ifnull +30 -> 100
    //   73: aload 6
    //   75: aconst_null
    //   76: iconst_3
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: aload_1
    //   83: aastore
    //   84: dup
    //   85: iconst_1
    //   86: aload 5
    //   88: aastore
    //   89: dup
    //   90: iconst_2
    //   91: aload_0
    //   92: getfield 42	com/tencent/mm/cache/MCacheItem:efu	Lcom/tencent/mm/sdk/e/c;
    //   95: aastore
    //   96: invokevirtual 96	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   99: pop
    //   100: iinc 4 1
    //   103: goto -65 -> 38
    //   106: astore 5
    //   108: ldc 98
    //   110: ldc 100
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload 5
    //   120: invokestatic 106	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   123: aastore
    //   124: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: goto -27 -> 100
    //   130: astore_1
    //   131: ldc 98
    //   133: ldc 100
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_1
    //   142: invokestatic 106	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   145: aastore
    //   146: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: ldc 46
    //   151: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aconst_null
    //   155: astore_1
    //   156: aload_1
    //   157: areturn
    //   158: aload_0
    //   159: getfield 42	com/tencent/mm/cache/MCacheItem:efu	Lcom/tencent/mm/sdk/e/c;
    //   162: astore_1
    //   163: ldc 46
    //   165: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: goto -12 -> 156
    //   171: astore 5
    //   173: goto -149 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   73	100	106	java/lang/Exception
    //   5	13	130	java/lang/Exception
    //   24	35	130	java/lang/Exception
    //   50	68	130	java/lang/Exception
    //   108	127	130	java/lang/Exception
    //   158	163	130	java/lang/Exception
    //   13	24	171	java/lang/Exception
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(57847);
    paramParcel.writeString(this.efu.getClass().getName());
    Field[] arrayOfField = c.ax(this.efu.getClass()).xDb;
    int i = arrayOfField.length;
    paramInt = 0;
    while (true)
      if (paramInt < i)
      {
        Field localField = arrayOfField[paramInt];
        Method localMethod = (Method)MCacheItem.a.efv.get(localField.getType());
        if (localMethod != null);
        try
        {
          localMethod.invoke(null, new Object[] { paramParcel, localField, this.efu });
          paramInt++;
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.MCacheItem", "exception:%s", new Object[] { bo.l(localException) });
        }
      }
    AppMethodBeat.o(57847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.MCacheItem
 * JD-Core Version:    0.6.2
 */