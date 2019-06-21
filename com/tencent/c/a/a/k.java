package com.tencent.c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k extends q
{
  public k(Context paramContext)
  {
    super(paramContext);
  }

  protected final void a(a parama)
  {
    AppMethodBeat.i(125750);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("write CheckEntity to sharedPreferences:");
      ((StringBuilder)localObject).append(parama.toString());
      s.zX();
      localObject = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
      ((SharedPreferences.Editor)localObject).putString(s.decode("4kU71lN96TJUomD1vOU9lgj9U+kKmxDPLVM+zzjst5U="), parama.toString());
      ((SharedPreferences.Editor)localObject).commit();
      return;
    }
    finally
    {
      AppMethodBeat.o(125750);
    }
    throw parama;
  }

  protected final String read()
  {
    AppMethodBeat.i(125747);
    try
    {
      s.zX();
      String str = PreferenceManager.getDefaultSharedPreferences(this.context).getString(s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="), null);
      return str;
    }
    finally
    {
      AppMethodBeat.o(125747);
    }
  }

  protected final void write(String paramString)
  {
    AppMethodBeat.i(125748);
    try
    {
      s.zX();
      SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
      localEditor.putString(s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="), paramString);
      localEditor.commit();
      return;
    }
    finally
    {
      AppMethodBeat.o(125748);
    }
    throw paramString;
  }

  protected final boolean zO()
  {
    return true;
  }

  protected final a zP()
  {
    AppMethodBeat.i(125749);
    try
    {
      Object localObject1 = PreferenceManager.getDefaultSharedPreferences(this.context).getString(s.decode("4kU71lN96TJUomD1vOU9lgj9U+kKmxDPLVM+zzjst5U="), null);
      a locala = new com/tencent/c/a/a/a;
      locala.<init>((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("read CheckEntity from sharedPreferences:");
      ((StringBuilder)localObject1).append(locala.toString());
      s.zX();
      return locala;
    }
    finally
    {
      AppMethodBeat.o(125749);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.k
 * JD-Core Version:    0.6.2
 */