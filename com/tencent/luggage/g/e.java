package com.tencent.luggage.g;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.content.b;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class e
{
  private static final WeakHashMap<Activity, e> bRG;

  @SuppressLint({"StaticFieldLeak"})
  private static final e bRH;
  private final SparseArray<e.a> bRC;
  public final SparseArray<e.d> bRD;
  public final Set<e.b> bRE;
  private Random bRF;
  private Activity mActivity;

  static
  {
    AppMethodBeat.i(90904);
    bRG = new WeakHashMap();
    bRH = new e(null);
    AppMethodBeat.o(90904);
  }

  private e(Activity paramActivity)
  {
    AppMethodBeat.i(90896);
    this.bRC = new SparseArray();
    this.bRD = new SparseArray();
    this.bRE = Collections.newSetFromMap(new ConcurrentHashMap());
    this.mActivity = paramActivity;
    this.bRF = new Random();
    AppMethodBeat.o(90896);
  }

  public static e ax(Context paramContext)
  {
    AppMethodBeat.i(90902);
    Assert.assertFalse("must implements ILuggageActivityHelper", false);
    if ((paramContext instanceof Activity))
    {
      if (!bRG.containsKey(paramContext))
        bRG.put((Activity)paramContext, new e((Activity)paramContext));
      paramContext = (e)bRG.get(paramContext);
      AppMethodBeat.o(90902);
    }
    while (true)
    {
      return paramContext;
      Assert.assertFalse(false);
      paramContext = bRH;
      AppMethodBeat.o(90902);
    }
  }

  public static void ay(Context paramContext)
  {
    AppMethodBeat.i(90903);
    if ((paramContext instanceof Activity))
      bRG.remove(paramContext);
    AppMethodBeat.o(90903);
  }

  private int b(SparseArray paramSparseArray)
  {
    AppMethodBeat.i(90900);
    int i;
    do
      i = rand();
    while (paramSparseArray.get(i) != null);
    AppMethodBeat.o(90900);
    return i;
  }

  private int rand()
  {
    AppMethodBeat.i(90901);
    int i = this.bRF.nextInt(2147483646);
    AppMethodBeat.o(90901);
    return i + 1 & 0xFFFF;
  }

  public final void a(Intent paramIntent, e.a parama)
  {
    AppMethodBeat.i(90898);
    if (this.mActivity == null)
      AppMethodBeat.o(90898);
    while (true)
    {
      return;
      int i = b(this.bRC);
      this.bRC.put(i, parama);
      this.mActivity.startActivityForResult(paramIntent, i);
      AppMethodBeat.o(90898);
    }
  }

  public final boolean a(String paramString, e.d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(90899);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
      AppMethodBeat.o(90899);
    int i;
    while (true)
    {
      return bool;
      if (this.mActivity == null)
      {
        AppMethodBeat.o(90899);
        bool = false;
      }
      else
      {
        try
        {
          i = b.checkSelfPermission(this.mActivity, paramString);
          if (i != 0)
            break;
          AppMethodBeat.o(90899);
        }
        catch (Exception paramString)
        {
          ab.e("Luggage.LuggageActivityHelper", "check mpermission exception:%s.", new Object[] { paramString });
          AppMethodBeat.o(90899);
        }
      }
    }
    if (this.mActivity != null)
    {
      if (Build.VERSION.SDK_INT >= 23)
        break label138;
      paramString = new int[1];
      Arrays.fill(paramString, 0);
      paramd.l(paramString);
    }
    while (true)
    {
      AppMethodBeat.o(90899);
      bool = false;
      break;
      label138: i = b(this.bRD);
      this.bRD.put(i, paramd);
      this.mActivity.requestPermissions(new String[] { paramString }, i);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(90897);
    Object localObject = this.bRE.iterator();
    while (((Iterator)localObject).hasNext())
      if (((e.b)((Iterator)localObject).next()).b(paramInt1, paramInt2, paramIntent))
        AppMethodBeat.o(90897);
    while (true)
    {
      return;
      localObject = (e.c)this.bRC.get(paramInt1);
      this.bRC.delete(paramInt1);
      if (localObject != null)
        ((e.a)localObject).b(paramInt2, paramIntent);
      AppMethodBeat.o(90897);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.e
 * JD-Core Version:    0.6.2
 */