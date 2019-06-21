package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.a;
import com.tencent.tencentmap.mapsdk.a.b;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class aw$a extends az
{
  private List<av> e;
  private Context f;
  private Long[] g;
  private boolean h;

  public aw$a(Context paramContext, List<av> paramList)
  {
    super(paramContext, 1, 2);
    AppMethodBeat.i(98512);
    this.e = null;
    this.g = null;
    this.h = false;
    this.e = paramList;
    this.f = paramContext;
    this.e.size();
    if ((this.e.size() == 1) && ("rqd_heartbeat".equals(((av)this.e.get(0)).d())))
      this.h = true;
    this.d = e.b(paramContext, 2);
    ag.a("real rid:%s", new Object[] { this.d });
    AppMethodBeat.o(98512);
  }

  private static aa a(int paramInt, List<av> paramList)
  {
    Object localObject = null;
    AppMethodBeat.i(98514);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(98514);
      paramList = localObject;
    }
    while (true)
    {
      return paramList;
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(" current size:");
        ag.b(paramList.size(), new Object[0]);
        paramList = a(paramList);
        if (paramList == null)
        {
          AppMethodBeat.o(98514);
          paramList = localObject;
        }
        else
        {
          paramList = paramList.a();
          if (paramList == null)
          {
            AppMethodBeat.o(98514);
            paramList = localObject;
          }
          else
          {
            paramList = a(paramInt, paramList);
            AppMethodBeat.o(98514);
          }
        }
      }
      catch (Throwable paramList)
      {
        ag.a(paramList);
        ag.d(" RealTimeRecordUploadDatas.encode2EventRecordPackage error}", new Object[0]);
        AppMethodBeat.o(98514);
        paramList = localObject;
      }
    }
  }

  private static ad a(List<av> paramList)
  {
    AppMethodBeat.i(98515);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(98515);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      ad localad;
      ArrayList localArrayList;
      try
      {
        localad = new com/tencent/tencentmap/mapsdk/maps/a/ad;
        localad.<init>();
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          ac localac = e.a((av)paramList.next());
          if (localac != null)
            localArrayList.add(localac);
        }
      }
      catch (Throwable paramList)
      {
        ag.a(paramList);
        AppMethodBeat.o(98515);
        paramList = null;
      }
      continue;
      localad.a = localArrayList;
      ag.b(" RealTimeRecordUploadDatas.encode2EventRecordPackage() end}", new Object[0]);
      AppMethodBeat.o(98515);
      paramList = localad;
    }
  }

  // ERROR //
  public final aa a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 158
    //   4: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 160
    //   9: iconst_0
    //   10: anewarray 73	java/lang/Object
    //   13: invokestatic 104	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aload_0
    //   17: getfield 30	com/tencent/tencentmap/mapsdk/maps/a/aw$a:e	Ljava/util/List;
    //   20: ifnull +15 -> 35
    //   23: aload_0
    //   24: getfield 30	com/tencent/tencentmap/mapsdk/maps/a/aw$a:e	Ljava/util/List;
    //   27: invokeinterface 42 1 0
    //   32: ifgt +14 -> 46
    //   35: ldc 158
    //   37: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: aconst_null
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: areturn
    //   46: aload_0
    //   47: getfield 163	com/tencent/tencentmap/mapsdk/maps/a/aw$a:a	I
    //   50: aload_0
    //   51: getfield 30	com/tencent/tencentmap/mapsdk/maps/a/aw$a:e	Ljava/util/List;
    //   54: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/aw$a:a	(ILjava/util/List;)Lcom/tencent/tencentmap/mapsdk/maps/a/aa;
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +30 -> 89
    //   62: ldc 158
    //   64: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: goto -25 -> 42
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    //   75: astore_1
    //   76: aload_1
    //   77: invokestatic 118	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   80: ldc 167
    //   82: iconst_0
    //   83: anewarray 73	java/lang/Object
    //   86: invokestatic 122	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: ldc 158
    //   91: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aconst_null
    //   95: astore_1
    //   96: goto -54 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   2	35	70	finally
    //   35	40	70	finally
    //   46	58	70	finally
    //   62	67	70	finally
    //   76	89	70	finally
    //   89	94	70	finally
    //   46	58	75	java/lang/Throwable
  }

  public final void b(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98516);
      ag.b(" TimeUpUploadDatas.done(), result:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      if ((this.e != null) && (!paramBoolean))
      {
        ag.f(" upload failed, save to db", new Object[0]);
        if (!this.h)
        {
          this.g = e.a(this.f, this.e);
          this.e = null;
        }
      }
      if ((paramBoolean) && (this.h))
      {
        Context localContext = this.f;
        b.a().a(108);
        a.a(localContext, "HEART_DENGTA", e.g());
        ag.a("heartbeat uploaded sucess!", new Object[0]);
      }
      if ((paramBoolean) && (this.g != null))
        e.a(this.f, this.g);
      if ((paramBoolean) && (this.g == null) && (this.e != null))
        this.e = null;
      AppMethodBeat.o(98516);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.aw.a
 * JD-Core Version:    0.6.2
 */