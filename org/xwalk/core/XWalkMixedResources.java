package org.xwalk.core;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.tencent.matrix.trace.core.AppMethodBeat;

class XWalkMixedResources extends Resources
{
  private Resources mLibraryResource;

  XWalkMixedResources(Resources paramResources1, Resources paramResources2)
  {
    super(paramResources1.getAssets(), paramResources1.getDisplayMetrics(), paramResources1.getConfiguration());
    AppMethodBeat.i(85703);
    this.mLibraryResource = paramResources2;
    AppMethodBeat.o(85703);
  }

  private boolean isCalledInLibrary()
  {
    boolean bool = false;
    AppMethodBeat.i(85702);
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    int i = arrayOfStackTraceElement.length;
    int j = 0;
    String str;
    if (j < i)
    {
      str = arrayOfStackTraceElement[j].getClassName();
      if ((str.startsWith("org.chromium")) || (str.startsWith("org.xwalk.core.internal")))
      {
        bool = true;
        AppMethodBeat.o(85702);
      }
    }
    while (true)
    {
      return bool;
      if ((str.startsWith("org.xwalk.core")) && (!str.endsWith("XWalkMixedResources")))
      {
        AppMethodBeat.o(85702);
      }
      else
      {
        j++;
        break;
        AppMethodBeat.o(85702);
      }
    }
  }

  public Drawable getDrawable(int paramInt)
  {
    AppMethodBeat.i(85709);
    boolean bool = isCalledInLibrary();
    if (bool);
    try
    {
      Drawable localDrawable1 = this.mLibraryResource.getDrawable(paramInt);
      AppMethodBeat.o(85709);
      while (true)
      {
        return localDrawable1;
        localDrawable1 = super.getDrawable(paramInt);
        AppMethodBeat.o(85709);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
      {
        Drawable localDrawable2;
        if (bool)
        {
          localDrawable2 = super.getDrawable(paramInt);
          AppMethodBeat.o(85709);
        }
        else
        {
          localDrawable2 = this.mLibraryResource.getDrawable(paramInt);
          AppMethodBeat.o(85709);
        }
      }
    }
  }

  public int getIdentifier(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(85708);
    int i;
    if (isCalledInLibrary())
    {
      i = this.mLibraryResource.getIdentifier(paramString1, paramString2, paramString3);
      if (i != 0)
        AppMethodBeat.o(85708);
    }
    while (true)
    {
      return i;
      i = super.getIdentifier(paramString1, paramString2, paramString3);
      AppMethodBeat.o(85708);
      continue;
      i = super.getIdentifier(paramString1, paramString2, paramString3);
      if (i != 0)
      {
        AppMethodBeat.o(85708);
      }
      else
      {
        i = this.mLibraryResource.getIdentifier(paramString1, paramString2, paramString3);
        AppMethodBeat.o(85708);
      }
    }
  }

  public XmlResourceParser getLayout(int paramInt)
  {
    AppMethodBeat.i(85705);
    boolean bool = isCalledInLibrary();
    if (bool);
    try
    {
      XmlResourceParser localXmlResourceParser1 = this.mLibraryResource.getLayout(paramInt);
      AppMethodBeat.o(85705);
      while (true)
      {
        return localXmlResourceParser1;
        localXmlResourceParser1 = super.getLayout(paramInt);
        AppMethodBeat.o(85705);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
      {
        XmlResourceParser localXmlResourceParser2;
        if (bool)
        {
          localXmlResourceParser2 = super.getLayout(paramInt);
          AppMethodBeat.o(85705);
        }
        else
        {
          localXmlResourceParser2 = this.mLibraryResource.getLayout(paramInt);
          AppMethodBeat.o(85705);
        }
      }
    }
  }

  public CharSequence getText(int paramInt)
  {
    AppMethodBeat.i(85704);
    boolean bool = isCalledInLibrary();
    if (bool);
    try
    {
      CharSequence localCharSequence1 = this.mLibraryResource.getText(paramInt);
      AppMethodBeat.o(85704);
      while (true)
      {
        return localCharSequence1;
        localCharSequence1 = super.getText(paramInt);
        AppMethodBeat.o(85704);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
      {
        CharSequence localCharSequence2;
        if (bool)
        {
          localCharSequence2 = super.getText(paramInt);
          AppMethodBeat.o(85704);
        }
        else
        {
          localCharSequence2 = this.mLibraryResource.getText(paramInt);
          AppMethodBeat.o(85704);
        }
      }
    }
  }

  public void getValue(int paramInt, TypedValue paramTypedValue, boolean paramBoolean)
  {
    AppMethodBeat.i(85706);
    boolean bool = isCalledInLibrary();
    if (bool);
    try
    {
      this.mLibraryResource.getValue(paramInt, paramTypedValue, paramBoolean);
      AppMethodBeat.o(85706);
      while (true)
      {
        return;
        super.getValue(paramInt, paramTypedValue, paramBoolean);
        AppMethodBeat.o(85706);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
        if (bool)
        {
          super.getValue(paramInt, paramTypedValue, paramBoolean);
          AppMethodBeat.o(85706);
        }
        else
        {
          this.mLibraryResource.getValue(paramInt, paramTypedValue, paramBoolean);
          AppMethodBeat.o(85706);
        }
    }
  }

  public void getValueForDensity(int paramInt1, int paramInt2, TypedValue paramTypedValue, boolean paramBoolean)
  {
    AppMethodBeat.i(85707);
    boolean bool = isCalledInLibrary();
    if (bool);
    try
    {
      this.mLibraryResource.getValueForDensity(paramInt1, paramInt2, paramTypedValue, paramBoolean);
      AppMethodBeat.o(85707);
      while (true)
      {
        return;
        super.getValueForDensity(paramInt1, paramInt2, paramTypedValue, paramBoolean);
        AppMethodBeat.o(85707);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
        if (bool)
        {
          super.getValueForDensity(paramInt1, paramInt2, paramTypedValue, paramBoolean);
          AppMethodBeat.o(85707);
        }
        else
        {
          this.mLibraryResource.getValueForDensity(paramInt1, paramInt2, paramTypedValue, paramBoolean);
          AppMethodBeat.o(85707);
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkMixedResources
 * JD-Core Version:    0.6.2
 */