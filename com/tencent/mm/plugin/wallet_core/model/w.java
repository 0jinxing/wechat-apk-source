package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fd;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.b;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

public final class w extends fd
{
  public static c.a ccO;
  public ArrayList<MallFunction> okP;
  private ArrayList<MallNews> okQ;
  private ArrayList<a> okR;
  public SparseArray<String> okS;

  static
  {
    AppMethodBeat.i(46899);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_region";
    locala.xDd.put("wallet_region", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" wallet_region INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "wallet_region";
    locala.columns[1] = "function_list";
    locala.xDd.put("function_list", "TEXT");
    localStringBuilder.append(" function_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "new_list";
    locala.xDd.put("new_list", "TEXT");
    localStringBuilder.append(" new_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "banner_list";
    locala.xDd.put("banner_list", "TEXT");
    localStringBuilder.append(" banner_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "type_name_list";
    locala.xDd.put("type_name_list", "TEXT");
    localStringBuilder.append(" type_name_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "isShowSetting";
    locala.xDd.put("isShowSetting", "INTEGER");
    localStringBuilder.append(" isShowSetting INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46899);
  }

  public w()
  {
    AppMethodBeat.i(46897);
    this.okP = new ArrayList();
    this.okQ = new ArrayList();
    this.okR = new ArrayList();
    this.okS = new SparseArray();
    AppMethodBeat.o(46897);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(46898);
    super.d(paramCursor);
    String str = this.field_function_list;
    Object localObject1 = this.field_new_list;
    Object localObject2 = this.field_banner_list;
    paramCursor = this.field_type_name_list;
    try
    {
      if (!bo.isNullOrNil(str))
      {
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(str);
        this.okP = b.F(localJSONArray);
      }
    }
    catch (Exception localException2)
    {
      try
      {
        JSONArray localJSONArray;
        if (!bo.isNullOrNil((String)localObject1))
        {
          localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>((String)localObject1);
          this.okQ = b.C(localJSONArray);
        }
      }
      catch (Exception localException2)
      {
        try
        {
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject1 = new org/json/JSONArray;
            ((JSONArray)localObject1).<init>((String)localObject2);
            this.okR = b.D((JSONArray)localObject1);
          }
        }
        catch (Exception localException2)
        {
          try
          {
            while (true)
            {
              if (!bo.isNullOrNil(paramCursor))
              {
                localObject2 = new org/json/JSONArray;
                ((JSONArray)localObject2).<init>(paramCursor);
                this.okS = b.E((JSONArray)localObject2);
              }
              AppMethodBeat.o(46898);
              return;
              localException3 = localException3;
              ab.printErrStackTrace("MicroMsg.WalletFunciontListInfo", localException3, "", new Object[0]);
              continue;
              localException1 = localException1;
              this.okQ = null;
              ab.printErrStackTrace("MicroMsg.WalletFunciontListInfo", localException1, "", new Object[0]);
              continue;
              localException2 = localException2;
              this.okR = null;
              ab.printErrStackTrace("MicroMsg.WalletFunciontListInfo", localException2, "", new Object[0]);
            }
          }
          catch (Exception paramCursor)
          {
            while (true)
            {
              this.okS = null;
              ab.printErrStackTrace("MicroMsg.WalletFunciontListInfo", paramCursor, "", new Object[0]);
              AppMethodBeat.o(46898);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.w
 * JD-Core Version:    0.6.2
 */