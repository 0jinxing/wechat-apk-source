package com.tencent.mm.app.plugin;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.b;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class e
  implements b
{
  private static e cgt = null;
  private URISpanHandlerSet cgu;
  private ArrayList<URISpanHandlerSet.BaseUriSpanHandler> cgv;
  private ArrayList<URISpanHandlerSet.BaseUriSpanHandler> cgw;
  private ArrayList<URISpanHandlerSet.BaseUriSpanHandler> cgx;
  private Context mContext;

  private e()
  {
    AppMethodBeat.i(15624);
    this.mContext = null;
    this.cgv = new ArrayList();
    this.cgw = new ArrayList();
    this.cgx = new ArrayList();
    long l = bo.anU();
    ab.d("MicroMsg.URISpanHandler", "init URISpanHandler");
    this.mContext = ah.getContext();
    this.cgu = new URISpanHandlerSet(this.mContext);
    Class[] arrayOfClass = URISpanHandlerSet.class.getDeclaredClasses();
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        if ((localClass != null) && (localClass.getSuperclass() != null) && (localClass.isAnnotationPresent(URISpanHandlerSet.a.class)) && (localClass.getSuperclass().getName().equals(URISpanHandlerSet.BaseUriSpanHandler.class.getName())));
        try
        {
          localObject1 = (URISpanHandlerSet.a)localClass.getAnnotation(URISpanHandlerSet.a.class);
          Object localObject2 = localClass.getDeclaredConstructor(new Class[] { URISpanHandlerSet.class });
          if (localObject2 != null)
          {
            localObject2 = (URISpanHandlerSet.BaseUriSpanHandler)URISpanHandlerSet.BaseUriSpanHandler.class.cast(((Constructor)localObject2).newInstance(new Object[] { this.cgu }));
            localObject1 = ((URISpanHandlerSet.a)localObject1).Cn();
            if (localObject1 == URISpanHandlerSet.PRIORITY.LOW)
              this.cgx.add(localObject2);
            while (true)
            {
              ab.d("MicroMsg.URISpanHandler", "successfully add: %s", new Object[] { localClass.getName() });
              j++;
              break;
              if (localObject1 != URISpanHandlerSet.PRIORITY.NORMAL)
                break label337;
              this.cgw.add(localObject2);
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            Object localObject1;
            ab.printErrStackTrace("MicroMsg.URISpanHandler", localException, "", new Object[0]);
            ab.d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", new Object[] { localClass.getName(), localException.getMessage(), localException.getClass().getName() });
            continue;
            label337: if (localObject1 == URISpanHandlerSet.PRIORITY.HIGH)
            {
              this.cgv.add(localException);
              continue;
              ab.d("MicroMsg.URISpanHandler", "failed to add %s, constructor is null!!", new Object[] { localClass.getName() });
            }
          }
        }
      }
    ab.d("MicroMsg.URISpanHandler", "init URISpanHandler used :%d ms", new Object[] { Long.valueOf(bo.anU() - l) });
    AppMethodBeat.o(15624);
  }

  public static e Cl()
  {
    AppMethodBeat.i(15623);
    if (cgt == null)
      cgt = new e();
    e locale = cgt;
    AppMethodBeat.o(15623);
    return locale;
  }

  private static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramArrayOfInt[j] == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public final boolean a(Context paramContext, m paramm, g paramg)
  {
    boolean bool1 = false;
    AppMethodBeat.i(15626);
    boolean bool2;
    if (paramm == null)
    {
      ab.d("MicroMsg.URISpanHandler", "handleSpanClick, hrefInfo is null");
      AppMethodBeat.o(15626);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      int i = paramm.type;
      if (paramg == null);
      for (bool2 = true; ; bool2 = false)
      {
        ab.d("MicroMsg.URISpanHandler", "handleSpanClick, hrefInfo.getType:%d, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size:%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Integer.valueOf(this.cgv.size()), Integer.valueOf(this.cgw.size()), Integer.valueOf(this.cgx.size()) });
        if (paramContext != null)
          break label150;
        ab.e("MicroMsg.URISpanHandler", "handleSpanClick, context is null!");
        this.cgu.mContext = null;
        AppMethodBeat.o(15626);
        bool2 = bool1;
        break;
      }
      label150: this.mContext = paramContext;
      this.cgu.mContext = this.mContext;
      Object localObject = this.cgv.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          paramContext = (URISpanHandlerSet.BaseUriSpanHandler)((Iterator)localObject).next();
          if ((contains(paramContext.Cm(), paramm.type)) && (paramContext.a(paramm, paramg)))
          {
            ab.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { paramContext.getClass().getName() });
            this.mContext = null;
            this.cgu.mContext = null;
            AppMethodBeat.o(15626);
            bool2 = true;
            break;
          }
        }
      localObject = this.cgw.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          paramContext = (URISpanHandlerSet.BaseUriSpanHandler)((Iterator)localObject).next();
          if ((contains(paramContext.Cm(), paramm.type)) && (paramContext.a(paramm, paramg)))
          {
            ab.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { paramContext.getClass().getName() });
            this.mContext = null;
            this.cgu.mContext = null;
            AppMethodBeat.o(15626);
            bool2 = true;
            break;
          }
        }
      paramContext = this.cgx.iterator();
      while (true)
        if (paramContext.hasNext())
        {
          localObject = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
          if ((contains(((URISpanHandlerSet.BaseUriSpanHandler)localObject).Cm(), paramm.type)) && (((URISpanHandlerSet.BaseUriSpanHandler)localObject).a(paramm, paramg)))
          {
            ab.d("MicroMsg.URISpanHandler", "handleSpanClick, %s handle", new Object[] { localObject.getClass().getName() });
            this.mContext = null;
            this.cgu.mContext = null;
            AppMethodBeat.o(15626);
            bool2 = true;
            break;
          }
        }
      this.mContext = null;
      this.cgu.mContext = null;
      ab.d("MicroMsg.URISpanHandler", "handleSpanClick, nothing handle");
      AppMethodBeat.o(15626);
      bool2 = bool1;
    }
  }

  public final boolean b(Context paramContext, String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(15627);
    boolean bool2;
    if (paramv == null)
    {
      bool2 = true;
      ab.d("MicroMsg.URISpanHandler", "handleUriJump, url:%s, isAllowScanQrCode:%b, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size: %d, mLowPriorityHandlerList.size: %d", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Integer.valueOf(this.cgv.size()), Integer.valueOf(this.cgw.size()), Integer.valueOf(this.cgx.size()) });
      if (paramContext != null)
        break label123;
      ab.e("MicroMsg.URISpanHandler", "handleUriJump, context is null!");
      this.cgu.mContext = null;
      AppMethodBeat.o(15627);
      paramBoolean = bool1;
    }
    while (true)
    {
      return paramBoolean;
      bool2 = false;
      break;
      label123: this.mContext = paramContext;
      this.cgu.mContext = this.mContext;
      if (bo.isNullOrNil(paramString))
      {
        ab.d("MicroMsg.URISpanHandler", "handleUriJump, url is null");
        this.mContext = null;
        this.cgu.mContext = null;
        AppMethodBeat.o(15627);
        paramBoolean = bool1;
      }
      else
      {
        paramContext = this.cgv.iterator();
        while (true)
          if (paramContext.hasNext())
          {
            localObject = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
            if (((URISpanHandlerSet.BaseUriSpanHandler)localObject).a(paramString, paramBoolean, paramv, paramBundle))
            {
              ab.d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", new Object[] { localObject.getClass().getName() });
              this.mContext = null;
              this.cgu.mContext = null;
              AppMethodBeat.o(15627);
              paramBoolean = true;
              break;
            }
          }
        Object localObject = this.cgw.iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
          {
            paramContext = (URISpanHandlerSet.BaseUriSpanHandler)((Iterator)localObject).next();
            if (paramContext.a(paramString, paramBoolean, paramv, paramBundle))
            {
              ab.d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", new Object[] { paramContext.getClass().getName() });
              this.mContext = null;
              this.cgu.mContext = null;
              AppMethodBeat.o(15627);
              paramBoolean = true;
              break;
            }
          }
        paramContext = this.cgx.iterator();
        while (true)
          if (paramContext.hasNext())
          {
            localObject = (URISpanHandlerSet.BaseUriSpanHandler)paramContext.next();
            if (((URISpanHandlerSet.BaseUriSpanHandler)localObject).a(paramString, paramBoolean, paramv, paramBundle))
            {
              ab.d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", new Object[] { localObject.getClass().getName() });
              this.mContext = null;
              this.cgu.mContext = null;
              AppMethodBeat.o(15627);
              paramBoolean = true;
              break;
            }
          }
        this.mContext = null;
        this.cgu.mContext = null;
        ab.d("MicroMsg.URISpanHandler", "handleUriJump, nothing handle");
        AppMethodBeat.o(15627);
        paramBoolean = bool1;
      }
    }
  }

  public final m y(Context paramContext, String paramString)
  {
    AppMethodBeat.i(15625);
    ab.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, url:%s, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size：%d", new Object[] { paramString, Integer.valueOf(this.cgv.size()), Integer.valueOf(this.cgw.size()), Integer.valueOf(this.cgx.size()) });
    if (paramContext == null)
    {
      ab.e("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl error, context is null!");
      this.cgu.mContext = null;
      AppMethodBeat.o(15625);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      this.mContext = paramContext;
      this.cgu.mContext = this.mContext;
      if (bo.isNullOrNil(paramString))
      {
        ab.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, url is null");
        this.mContext = null;
        this.cgu.mContext = null;
        AppMethodBeat.o(15625);
        paramContext = null;
      }
      else
      {
        Iterator localIterator = this.cgv.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            paramContext = ((URISpanHandlerSet.BaseUriSpanHandler)localIterator.next()).dr(paramString);
            if (paramContext != null)
            {
              ab.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(paramContext.type) });
              this.mContext = null;
              this.cgu.mContext = null;
              AppMethodBeat.o(15625);
              break;
            }
          }
        localIterator = this.cgw.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            paramContext = ((URISpanHandlerSet.BaseUriSpanHandler)localIterator.next()).dr(paramString);
            if (paramContext != null)
            {
              ab.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(paramContext.type) });
              this.mContext = null;
              this.cgu.mContext = null;
              AppMethodBeat.o(15625);
              break;
            }
          }
        localIterator = this.cgx.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            paramContext = ((URISpanHandlerSet.BaseUriSpanHandler)localIterator.next()).dr(paramString);
            if (paramContext != null)
            {
              ab.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, result.type:%d", new Object[] { Integer.valueOf(paramContext.type) });
              this.mContext = null;
              this.cgu.mContext = null;
              AppMethodBeat.o(15625);
              break;
            }
          }
        this.mContext = null;
        this.cgu.mContext = null;
        ab.d("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl, nothing match");
        AppMethodBeat.o(15625);
        paramContext = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.e
 * JD-Core Version:    0.6.2
 */