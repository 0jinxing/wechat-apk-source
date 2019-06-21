package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.j;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public final class l
{
  private static ae<String, Integer> vjp;
  private Context mContext;
  private StringBuilder vjh;
  private SpannableStringBuilder vji;
  private SpannableString vjj;
  private SpannableStringBuilder vjk;
  private CharacterStyle vjl;
  private int vjm;
  private int vjn;
  public int vjo;

  static
  {
    AppMethodBeat.i(27578);
    vjp = new ae(50);
    AppMethodBeat.o(27578);
  }

  public l(Context paramContext)
  {
    AppMethodBeat.i(27572);
    this.vji = new SpannableStringBuilder();
    this.vjk = new SpannableStringBuilder();
    this.vjl = new ForegroundColorSpan(-5066062);
    this.vjo = 3;
    this.mContext = paramContext;
    AppMethodBeat.o(27572);
  }

  public final void a(MMEditText paramMMEditText)
  {
    AppMethodBeat.i(27574);
    if (paramMMEditText == null)
      AppMethodBeat.o(27574);
    while (true)
    {
      return;
      this.vjo = 0;
      this.vjj = com.tencent.mm.cb.g.dqQ().b(paramMMEditText.getText().toString(), paramMMEditText.getTextSize());
      ab.d("MicroMsg.VoiceInputHelper", "setFinalText emojiSpannableString = %s", new Object[] { this.vjj });
      paramMMEditText.setText(this.vjj);
      paramMMEditText.setSelection(this.vjj.length());
      AppMethodBeat.o(27574);
    }
  }

  public final void a(MMEditText paramMMEditText, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(27573);
    if (paramMMEditText == null)
      AppMethodBeat.o(27573);
    while (true)
    {
      return;
      if (this.vjh == null)
      {
        paramMMEditText = new IllegalStateException("You should saveHistory before setText");
        AppMethodBeat.o(27573);
        throw paramMMEditText;
      }
      int i = this.vjm + paramString.length();
      this.vji.clear();
      this.vjk.clear();
      SpannableStringBuilder localSpannableStringBuilder2;
      if (paramBoolean)
      {
        this.vjj = com.tencent.mm.cb.g.dqQ().b(this.vjh.subSequence(0, this.vjm), paramMMEditText.getTextSize());
        SpannableStringBuilder localSpannableStringBuilder1 = this.vji.append(this.vjj);
        localSpannableStringBuilder2 = this.vjk;
        if ((localSpannableStringBuilder2 == null) || (paramString == null) || (paramString.length() == 0))
          localSpannableStringBuilder1.append(localSpannableStringBuilder2).append(this.vjh.subSequence(this.vjn, this.vjh.length()));
      }
      while (true)
      {
        ab.d("MicroMsg.VoiceInputHelper", "setText historySelectStart = %s, historySelectEnd = %s, cursor = %s, length = %s, text = %s, spannableStringBuilder = %s", new Object[] { Integer.valueOf(this.vjm), Integer.valueOf(this.vjn), Integer.valueOf(i), Integer.valueOf(this.vji.length()), paramString, this.vji });
        paramMMEditText.setText(this.vji);
        if (i > this.vji.length())
          break label366;
        if (i != 0)
          break label360;
        paramMMEditText.setSelection(this.vji.length());
        AppMethodBeat.o(27573);
        break;
        int j;
        if (paramString.length() < this.vjo)
          j = paramString.length();
        for (int k = 0; ; k = j - this.vjo)
        {
          localSpannableStringBuilder2.append(paramString).setSpan(this.vjl, k, j, 33);
          break;
          j = paramString.length();
        }
        this.vjj = com.tencent.mm.cb.g.dqQ().b(paramString, paramMMEditText.getTextSize());
        this.vji.append(this.vjj);
      }
      label360: paramMMEditText.setSelection(i);
      label366: AppMethodBeat.o(27573);
    }
  }

  public final int aju(String paramString)
  {
    try
    {
      AppMethodBeat.i(27576);
      int j;
      if (vjp.size() == 0)
      {
        Object localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVk, "");
        try
        {
          localObject = ((String)localObject).split(";");
          int i = localObject.length;
          for (j = 0; j < i; j++)
          {
            String[] arrayOfString = localObject[j].split(":");
            if (arrayOfString.length == 2)
              vjp.put(arrayOfString[0], Integer.valueOf(j.getInt(arrayOfString[1], 0)));
          }
        }
        catch (Error localError)
        {
        }
      }
      if (vjp.aj(paramString))
      {
        j = ((Integer)vjp.get(paramString)).intValue();
        AppMethodBeat.o(27576);
      }
      while (true)
      {
        return j;
        AppMethodBeat.o(27576);
        j = 0;
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void b(MMEditText paramMMEditText)
  {
    AppMethodBeat.i(27575);
    if (paramMMEditText == null)
      AppMethodBeat.o(27575);
    while (true)
    {
      return;
      this.vjm = paramMMEditText.getSelectionStart();
      this.vjn = paramMMEditText.getSelectionEnd();
      this.vjh = new StringBuilder(paramMMEditText.getText());
      ab.d("MicroMsg.VoiceInputHelper", "saveHistory historySelectStart = %s, historySelectEnd = %s, historyStringBuilder = %s", new Object[] { Integer.valueOf(this.vjm), Integer.valueOf(this.vjn), this.vjh });
      if (paramMMEditText.getText().toString().equalsIgnoreCase(""))
        this.vji.clear();
      AppMethodBeat.o(27575);
    }
  }

  public final void ea(String paramString, int paramInt)
  {
    try
    {
      AppMethodBeat.i(27577);
      vjp.put(paramString, Integer.valueOf(paramInt));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object[] arrayOfObject = vjp.map.keySet().toArray();
      paramString = vjp.map.values().toArray();
      for (paramInt = 0; paramInt < arrayOfObject.length; paramInt++)
        localStringBuilder.append(arrayOfObject[paramInt]).append(":").append(paramString[paramInt]).append(";");
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVk, localStringBuilder.toString());
      AppMethodBeat.o(27577);
      return;
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.l
 * JD-Core Version:    0.6.2
 */