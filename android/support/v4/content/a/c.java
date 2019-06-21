package android.support.v4.content.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class c
{
  public static float a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    if (!a(paramXmlPullParser, paramString));
    while (true)
    {
      return paramFloat;
      paramFloat = paramTypedArray.getFloat(paramInt, paramFloat);
    }
  }

  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    int i = 0;
    if (!a(paramXmlPullParser, paramString));
    for (paramInt = i; ; paramInt = paramTypedArray.getResourceId(paramInt, 0))
      return paramInt;
  }

  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString));
    while (true)
    {
      return paramInt2;
      paramInt2 = paramTypedArray.getInt(paramInt1, paramInt2);
    }
  }

  public static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null);
    for (paramResources = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt); ; paramResources = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0))
      return paramResources;
  }

  public static TypedValue a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString)
  {
    if (!a(paramXmlPullParser, paramString));
    for (paramTypedArray = null; ; paramTypedArray = paramTypedArray.peekValue(0))
      return paramTypedArray;
  }

  public static boolean a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean)
  {
    if (!a(paramXmlPullParser, paramString));
    while (true)
    {
      return paramBoolean;
      paramBoolean = paramTypedArray.getBoolean(paramInt, paramBoolean);
    }
  }

  public static boolean a(XmlPullParser paramXmlPullParser, String paramString)
  {
    if (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString));
    while (true)
    {
      return paramInt2;
      paramInt2 = paramTypedArray.getColor(paramInt1, paramInt2);
    }
  }

  public static String b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    if (!a(paramXmlPullParser, paramString));
    for (paramTypedArray = null; ; paramTypedArray = paramTypedArray.getString(paramInt))
      return paramTypedArray;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.content.a.c
 * JD-Core Version:    0.6.2
 */