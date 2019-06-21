package com.tencent.mm.ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.widget.a.c;

public class SecurityImage extends LinearLayout
{
  private int gCL = 0;
  private c gud = null;
  private String guh = null;
  private String gui = null;
  private ProgressBar yrQ = null;
  private ImageView yrR = null;
  private Button yrS = null;
  private EditText yrT = null;
  private SecurityImage.b yrU;

  public SecurityImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a(int paramInt, Bitmap paramBitmap, String paramString1, String paramString2)
  {
    AppMethodBeat.i(106241);
    this.guh = paramString1;
    this.gui = paramString2;
    this.gCL = paramInt;
    if (paramBitmap != null)
    {
      this.yrR.setImageBitmap(paramBitmap);
      AppMethodBeat.o(106241);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SecurityImage", "setSecImg failed, decode failed");
      AppMethodBeat.o(106241);
    }
  }

  private void c(int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    AppMethodBeat.i(106240);
    this.guh = paramString1;
    this.gui = paramString2;
    this.gCL = paramInt;
    Bitmap localBitmap = d.bQ(paramArrayOfByte);
    if (localBitmap != null)
    {
      ab.i("MicroMsg.SecurityImage", "dkwt setSecImg sid:%s key:%s imgBuf:%d [%d %d]", new Object[] { paramString1, paramString2, Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(localBitmap.getWidth()), Integer.valueOf(localBitmap.getHeight()) });
      a(paramInt, localBitmap, paramString1, paramString2);
      AppMethodBeat.o(106240);
      return;
    }
    if (paramArrayOfByte == null);
    for (paramInt = -1; ; paramInt = paramArrayOfByte.length)
    {
      ab.e("MicroMsg.SecurityImage", "dkwt setSecImg ERROR sid:%s key:%s imgBuf:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
      AppMethodBeat.o(106240);
      break;
    }
  }

  private void qa(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(106239);
    Object localObject = this.yrR;
    if (paramBoolean)
    {
      j = 255;
      ((ImageView)localObject).setAlpha(j);
      localObject = this.yrR;
      if (!paramBoolean)
        break label79;
    }
    label79: for (int j = 0; ; j = -5592406)
    {
      ((ImageView)localObject).setBackgroundColor(j);
      localObject = this.yrQ;
      j = i;
      if (paramBoolean)
        j = 4;
      ((ProgressBar)localObject).setVisibility(j);
      AppMethodBeat.o(106239);
      return;
      j = 40;
      break;
    }
  }

  public final void a(int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    AppMethodBeat.i(106235);
    this.yrQ = ((ProgressBar)findViewById(2131827297));
    this.yrR = ((ImageView)findViewById(2131827296));
    this.yrS = ((Button)findViewById(2131827298));
    this.yrT = ((EditText)findViewById(2131827299));
    this.yrS.setOnClickListener(new SecurityImage.1(this));
    b(paramInt, paramArrayOfByte, paramString1, paramString2);
    AppMethodBeat.o(106235);
  }

  public final void b(int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    AppMethodBeat.i(106236);
    qa(true);
    c(paramInt, paramArrayOfByte, paramString1, paramString2);
    AppMethodBeat.o(106236);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(106238);
    if (this.gud != null)
    {
      this.gud.dismiss();
      this.gud = null;
    }
    AppMethodBeat.o(106238);
  }

  public int getSecCodeType()
  {
    return this.gCL;
  }

  public String getSecImgCode()
  {
    AppMethodBeat.i(106237);
    String str;
    if (this.yrT == null)
    {
      str = "";
      AppMethodBeat.o(106237);
    }
    while (true)
    {
      return str;
      str = this.yrT.getText().toString().trim();
      AppMethodBeat.o(106237);
    }
  }

  public String getSecImgEncryptKey()
  {
    return this.gui;
  }

  public String getSecImgSid()
  {
    return this.guh;
  }

  public void setNetworkModel(SecurityImage.b paramb)
  {
    AppMethodBeat.i(106234);
    if (this.yrU != null)
      this.yrU.d(null);
    this.yrU = paramb;
    this.yrU.d(this);
    AppMethodBeat.o(106234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.SecurityImage
 * JD-Core Version:    0.6.2
 */