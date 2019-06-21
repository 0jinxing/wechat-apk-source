package com.tencent.filter.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class aj
{
  private static String bNX = "precision highp float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform mat4 Projection;\nuniform mat4 Modelview; \nuniform mat4 textureMat; \nuniform mat4 tMat;\nvoid main(void)\n{\ngl_Position = Projection * Modelview *position;\nvec4 tmp = tMat*vec4(inputTextureCoordinate.x,inputTextureCoordinate.y,0.0,1.0);\ntextureCoordinate = tmp.xy;\n}\n";
  private static String bNY = "precision highp float;\nvarying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n void main()\n {\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n }\n";

  public static String b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(86488);
    String str;
    if (paramInt <= 0)
    {
      str = bNY;
      AppMethodBeat.o(86488);
    }
    while (true)
    {
      return str;
      float[] arrayOfFloat = new float[paramInt + 1];
      float f1 = 0.0F;
      int i = 0;
      if (i < paramInt + 1)
      {
        arrayOfFloat[i] = ((float)(1.0D / Math.sqrt(6.283185307179586D * Math.pow(paramFloat, 2.0D)) * Math.exp(-Math.pow(i, 2.0D) / (2.0D * Math.pow(paramFloat, 2.0D)))));
        if (i == 0);
        for (f1 = arrayOfFloat[i] + f1; ; f1 = (float)(f1 + 2.0D * arrayOfFloat[i]))
        {
          i++;
          break;
        }
      }
      for (i = 0; i < paramInt + 1; i++)
        arrayOfFloat[i] /= f1;
      int j = Math.min(paramInt / 2 + paramInt % 2, 7);
      Object localObject = new float[j];
      for (i = 0; i < j; i++)
      {
        f1 = arrayOfFloat[(i * 2 + 1)];
        paramFloat = arrayOfFloat[(i * 2 + 2)];
        localObject[i] = ((f1 * (i * 2 + 1) + paramFloat * (i * 2 + 2)) / (f1 + paramFloat));
      }
      i = paramInt / 2 + paramInt % 2;
      str = String.format(Locale.ENGLISH, "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform float horStep;\nuniform float verStep;\nvarying vec2 textureCoordinate;\nvoid main(void)\n{\nlowp vec4 sum = vec4(0.0);\n", new Object[] { Integer.valueOf(j * 2 + 1) });
      str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy) * %f;\n", new Object[] { Float.valueOf(arrayOfFloat[0]) });
      if (paramBoolean);
      for (str = str + "highp vec2 singleStepOffset = vec2(horStep, 0.0);\n"; ; str = str + "highp vec2 singleStepOffset = vec2(0.0, verStep);\n")
        for (paramInt = 0; paramInt < j; paramInt++)
        {
          paramFloat = arrayOfFloat[(paramInt * 2 + 1)] + arrayOfFloat[(paramInt * 2 + 2)];
          str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy + singleStepOffset * %f) * %f;\n", new Object[] { Float.valueOf(localObject[paramInt]), Float.valueOf(paramFloat) });
          str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy - singleStepOffset * %f) * %f;\n", new Object[] { Float.valueOf(localObject[paramInt]), Float.valueOf(paramFloat) });
        }
      localObject = str;
      if (i > j)
        for (paramInt = j; ; paramInt++)
        {
          localObject = str;
          if (paramInt >= i)
            break;
          f1 = arrayOfFloat[(paramInt * 2 + 1)];
          float f2 = arrayOfFloat[(paramInt * 2 + 2)];
          paramFloat = f1 + f2;
          f1 = (f1 * (paramInt * 2 + 1) + f2 * (paramInt * 2 + 2)) / paramFloat;
          str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy + singleStepOffset * %f) * %f;\n", new Object[] { Float.valueOf(f1), Float.valueOf(paramFloat) });
          str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy - singleStepOffset * %f) * %f;\n", new Object[] { Float.valueOf(f1), Float.valueOf(paramFloat) });
        }
      str = (String)localObject + "gl_FragColor = sum;\n";
      str = str + "}\n";
      AppMethodBeat.o(86488);
    }
  }

  public static String b(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(86489);
    String str;
    if (paramInt <= 0)
    {
      str = bNY;
      AppMethodBeat.o(86489);
    }
    while (true)
    {
      return str;
      float[] arrayOfFloat = new float[paramInt + 1];
      float f1 = 0.0F;
      int i = 0;
      if (i < paramInt + 1)
      {
        arrayOfFloat[i] = ((float)(1.0D / Math.sqrt(6.283185307179586D * Math.pow(paramFloat, 2.0D)) * Math.exp(-Math.pow(i, 2.0D) / (2.0D * Math.pow(paramFloat, 2.0D)))));
        if (i == 0);
        for (f1 = arrayOfFloat[i] + f1; ; f1 = (float)(f1 + 2.0D * arrayOfFloat[i]))
        {
          i++;
          break;
        }
      }
      for (i = 0; i < paramInt + 1; i++)
        arrayOfFloat[i] /= f1;
      int j = Math.min(paramInt / 2 + paramInt % 2, 7);
      Object localObject = new float[j];
      for (i = 0; i < j; i++)
      {
        paramFloat = arrayOfFloat[(i * 2 + 1)];
        f1 = arrayOfFloat[(i * 2 + 2)];
        localObject[i] = ((paramFloat * (i * 2 + 1) + f1 * (i * 2 + 2)) / (paramFloat + f1));
      }
      i = paramInt / 2 + paramInt % 2;
      str = String.format(Locale.ENGLISH, "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform float horStep;\nuniform float verStep;\nvarying vec2 textureCoordinate;\nvoid main(void)\n{\n vec4 color = texture2D(inputImageTexture,textureCoordinate);\nlowp float sum = 0.0;\n", new Object[] { Integer.valueOf(j * 2 + 1) });
      if (paramBoolean1)
      {
        str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy).g * %f;\n", new Object[] { Float.valueOf(arrayOfFloat[0]) });
        if (!paramBoolean2)
          break label537;
        str = str + "highp vec2 singleStepOffset = vec2(horStep, 0.0);\n";
        label358: paramInt = 0;
        label360: if (paramInt >= j)
          break label663;
        paramFloat = arrayOfFloat[(paramInt * 2 + 1)] + arrayOfFloat[(paramInt * 2 + 2)];
        if (!paramBoolean1)
          break label562;
        str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy + singleStepOffset * %f).g * %f;\n", new Object[] { Float.valueOf(localObject[paramInt]), Float.valueOf(paramFloat) });
      }
      for (str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy - singleStepOffset * %f).g * %f;\n", new Object[] { Float.valueOf(localObject[paramInt]), Float.valueOf(paramFloat) }); ; str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy - singleStepOffset * %f).a * %f;\n", new Object[] { Float.valueOf(localObject[paramInt]), Float.valueOf(paramFloat) }))
      {
        paramInt++;
        break label360;
        str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy).a * %f;\n", new Object[] { Float.valueOf(arrayOfFloat[0]) });
        break;
        label537: str = str + "highp vec2 singleStepOffset = vec2(0.0, verStep);\n";
        break label358;
        label562: str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy + singleStepOffset * %f).a * %f;\n", new Object[] { Float.valueOf(localObject[paramInt]), Float.valueOf(paramFloat) });
      }
      label663: localObject = str;
      if (i > j)
      {
        paramInt = j;
        localObject = str;
        if (paramInt < i)
        {
          f1 = arrayOfFloat[(paramInt * 2 + 1)];
          float f2 = arrayOfFloat[(paramInt * 2 + 2)];
          paramFloat = f1 + f2;
          f1 = (f1 * (paramInt * 2 + 1) + f2 * (paramInt * 2 + 2)) / paramFloat;
          if (paramBoolean1)
            str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy + singleStepOffset * %f).g * %f;\n", new Object[] { Float.valueOf(f1), Float.valueOf(paramFloat) });
          for (str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy - singleStepOffset * %f).g * %f;\n", new Object[] { Float.valueOf(f1), Float.valueOf(paramFloat) }); ; str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy - singleStepOffset * %f).a * %f;\n", new Object[] { Float.valueOf(f1), Float.valueOf(paramFloat) }))
          {
            paramInt++;
            break;
            str = str + String.format(Locale.ENGLISH, "sum += texture2D(inputImageTexture, textureCoordinate.xy + singleStepOffset * %f).a * %f;\n", new Object[] { Float.valueOf(f1), Float.valueOf(paramFloat) });
          }
        }
      }
      str = (String)localObject + "color.a = sum;\n";
      str = str + "gl_FragColor = color;\n";
      str = str + "}\n";
      AppMethodBeat.o(86489);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.aj
 * JD-Core Version:    0.6.2
 */