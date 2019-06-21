package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.e.a;

public class CdnImageView extends MMImageView
  implements a
{
  private static final String tOJ;
  private int eTi;
  private int eTj;
  private ak handler;
  private String url;
  private String vjW;
  private String vjX;
  private boolean vjY;
  private boolean vjZ;

  static
  {
    AppMethodBeat.i(79730);
    tOJ = com.tencent.mm.compatible.util.e.eSn + "wallet/images/";
    AppMethodBeat.o(79730);
  }

  public CdnImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CdnImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CdnImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(79718);
    this.url = null;
    this.vjZ = false;
    this.handler = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(79716);
        Object localObject = bo.bc(paramAnonymousMessage.getData().getString("k_url"), "");
        CdnImageView.a(CdnImageView.this, bo.bc(CdnImageView.a(CdnImageView.this), ""));
        if ((bo.isNullOrNil(CdnImageView.a(CdnImageView.this))) && (bo.isNullOrNil((String)localObject)))
        {
          CdnImageView.this.setImageBitmap(null);
          CdnImageView.this.setImageBitmapCompleted(null);
          AppMethodBeat.o(79716);
        }
        while (true)
        {
          return;
          if (!CdnImageView.a(CdnImageView.this).equals(localObject))
          {
            ab.d("MicroMsg.CdnImageView", "hy: url not equal. abort this msg");
            AppMethodBeat.o(79716);
          }
          else
          {
            paramAnonymousMessage = paramAnonymousMessage.getData().getByteArray("k_data");
            if ((paramAnonymousMessage == null) || (paramAnonymousMessage.length == 0))
            {
              ab.e("MicroMsg.CdnImageView", "handleMsg fail, data is null");
              AppMethodBeat.o(79716);
            }
            else
            {
              localObject = com.tencent.mm.sdk.platformtools.d.bQ(paramAnonymousMessage);
              o.ahk();
              c.h(CdnImageView.a(CdnImageView.this), (Bitmap)localObject);
              if (CdnImageView.b(CdnImageView.this))
                CdnImageView.a(CdnImageView.this, (Bitmap)localObject);
              paramAnonymousMessage = (Message)localObject;
              if (localObject != null)
              {
                paramAnonymousMessage = (Message)localObject;
                if (CdnImageView.c(CdnImageView.this) > 0)
                {
                  paramAnonymousMessage = (Message)localObject;
                  if (CdnImageView.d(CdnImageView.this) > 0)
                    paramAnonymousMessage = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, CdnImageView.d(CdnImageView.this), CdnImageView.c(CdnImageView.this), true, false);
                }
              }
              localObject = paramAnonymousMessage;
              if (CdnImageView.e(CdnImageView.this))
              {
                localObject = paramAnonymousMessage;
                if (paramAnonymousMessage != null)
                  localObject = com.tencent.mm.sdk.platformtools.d.a(paramAnonymousMessage, false, paramAnonymousMessage.getWidth() * 0.5F);
              }
              if (localObject != null)
                CdnImageView.this.setImageBitmap((Bitmap)localObject);
              CdnImageView.this.setImageBitmapCompleted((Bitmap)localObject);
              AppMethodBeat.o(79716);
            }
          }
        }
      }
    };
    AppMethodBeat.o(79718);
  }

  private void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(79724);
    this.url = paramString1;
    this.eTi = paramInt1;
    this.eTj = paramInt2;
    this.vjW = paramString2;
    if (!bo.isNullOrNil(this.vjW))
    {
      paramString2 = com.tencent.mm.sdk.platformtools.d.aml(this.vjW);
      if ((paramString2 != null) && (paramString2.getWidth() > 0) && (paramString2.getHeight() > 0))
      {
        setImageBitmap(paramString2);
        setImageBitmapCompleted(paramString2);
        AppMethodBeat.o(79724);
      }
    }
    while (true)
    {
      return;
      if ((paramString1 == null) || (paramString1.length() == 0))
      {
        setVisibility(8);
        AppMethodBeat.o(79724);
      }
      else if (paramString1.startsWith("http"))
      {
        ec(paramString1, paramInt3);
        AppMethodBeat.o(79724);
      }
      else
      {
        ajB(paramString1);
        AppMethodBeat.o(79724);
      }
    }
  }

  private void ajB(String paramString)
  {
    AppMethodBeat.i(79726);
    if (!com.tencent.mm.vfs.e.ct(paramString))
    {
      setVisibility(8);
      AppMethodBeat.o(79726);
    }
    while (true)
    {
      return;
      if ((this.eTi <= 0) || (this.eTj <= 0));
      for (paramString = com.tencent.mm.sdk.platformtools.d.aml(paramString); ; paramString = com.tencent.mm.sdk.platformtools.d.d(paramString, this.eTi, this.eTj, true))
      {
        if (paramString != null)
          break label78;
        setVisibility(8);
        AppMethodBeat.o(79726);
        break;
      }
      label78: Object localObject = paramString;
      if (this.vjY)
      {
        localObject = paramString;
        if (paramString != null)
          localObject = com.tencent.mm.sdk.platformtools.d.a(paramString, false, paramString.getWidth() * 0.5F);
      }
      setImageBitmap((Bitmap)localObject);
      setImageBitmapCompleted((Bitmap)localObject);
      AppMethodBeat.o(79726);
    }
  }

  private boolean dju()
  {
    boolean bool = true;
    AppMethodBeat.i(79727);
    try
    {
      Object localObject1 = getCacheFilePath();
      ab.d("MicroMsg.CdnImageView", "useSdcardCache, path: %s", new Object[] { localObject1 });
      if (com.tencent.mm.vfs.e.ct((String)localObject1))
      {
        Object localObject2 = com.tencent.mm.sdk.platformtools.d.aml((String)localObject1);
        ab.d("MicroMsg.CdnImageView", "get bitmap from cache path: %s", new Object[] { localObject2 });
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (this.eTi > 0)
          {
            localObject1 = localObject2;
            if (this.eTj > 0)
              localObject1 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, this.eTj, this.eTi, true, false);
          }
          localObject2 = localObject1;
          if (this.vjY)
          {
            localObject2 = localObject1;
            if (localObject1 != null)
              localObject2 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, false, ((Bitmap)localObject1).getWidth() * 0.5F);
          }
          setImageBitmap((Bitmap)localObject2);
          setImageBitmapCompleted((Bitmap)localObject2);
          AppMethodBeat.o(79727);
          return bool;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CdnImageView", localException, "setBitmapFromLocalCache error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(79727);
        bool = false;
      }
    }
  }

  private void ec(String paramString, int paramInt)
  {
    AppMethodBeat.i(79728);
    o.ahk();
    Object localObject = c.kR(paramString);
    if (localObject != null)
    {
      paramString = (String)localObject;
      if (this.eTi > 0)
      {
        paramString = (String)localObject;
        if (this.eTj > 0)
          paramString = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, this.eTi, this.eTj, true, false);
      }
      localObject = paramString;
      if (this.vjY)
      {
        localObject = paramString;
        if (paramString != null)
          localObject = com.tencent.mm.sdk.platformtools.d.a(paramString, false, paramString.getWidth() * 0.5F);
      }
      setImageBitmap((Bitmap)localObject);
      setImageBitmapCompleted((Bitmap)localObject);
      AppMethodBeat.o(79728);
    }
    while (true)
    {
      return;
      if ((!this.vjZ) || (!dju()))
        break;
      AppMethodBeat.o(79728);
    }
    if (paramInt > 0)
      setImageResource(paramInt);
    while (true)
    {
      com.tencent.mm.sdk.g.d.post(new CdnImageView.a(paramString, this.handler), "CdnImageView_download");
      AppMethodBeat.o(79728);
      break;
      setImageBitmap(null);
    }
  }

  private String getCacheFilePath()
  {
    AppMethodBeat.i(79725);
    String str;
    if (!bo.isNullOrNil(this.vjW))
      str = this.vjW;
    while (true)
    {
      AppMethodBeat.o(79725);
      return str;
      if (!bo.isNullOrNil(this.vjX))
      {
        str = this.vjX + g.x(this.url.getBytes());
      }
      else
      {
        com.tencent.mm.vfs.e.tf(tOJ);
        str = tOJ + g.x(this.url.getBytes());
      }
    }
  }

  public final void am(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79721);
    n(paramString, paramInt1, paramInt2, -1);
    AppMethodBeat.o(79721);
  }

  public final void eb(String paramString, int paramInt)
  {
    AppMethodBeat.i(79720);
    n(paramString, 0, 0, paramInt);
    AppMethodBeat.o(79720);
  }

  public final void hI(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79722);
    a(paramString1, -1, 0, 0, paramString2);
    AppMethodBeat.o(79722);
  }

  public final void n(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79723);
    a(paramString, paramInt1, paramInt2, paramInt3, null);
    AppMethodBeat.o(79723);
  }

  public void setImageBitmapCompleted(Bitmap paramBitmap)
  {
  }

  public void setImgSavedDir(String paramString)
  {
    this.vjX = paramString;
  }

  public void setImgSavedPath(String paramString)
  {
    this.vjW = paramString;
  }

  public void setRoundCorner(boolean paramBoolean)
  {
    this.vjY = paramBoolean;
  }

  public void setUrl(String paramString)
  {
    AppMethodBeat.i(79719);
    n(paramString, 0, 0, -1);
    AppMethodBeat.o(79719);
  }

  public void setUseSdcardCache(boolean paramBoolean)
  {
    this.vjZ = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.CdnImageView
 * JD-Core Version:    0.6.2
 */