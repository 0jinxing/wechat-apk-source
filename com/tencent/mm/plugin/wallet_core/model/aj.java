package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fi;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class aj extends fi
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(46962);
    c.a locala = new c.a();
    locala.xDb = new Field[32];
    locala.columns = new String[33];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "uin";
    locala.xDd.put("uin", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" uin TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "uin";
    locala.columns[1] = "is_reg";
    locala.xDd.put("is_reg", "INTEGER");
    localStringBuilder.append(" is_reg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "true_name";
    locala.xDd.put("true_name", "TEXT");
    localStringBuilder.append(" true_name TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "card_num";
    locala.xDd.put("card_num", "INTEGER");
    localStringBuilder.append(" card_num INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "isDomesticUser";
    locala.xDd.put("isDomesticUser", "INTEGER");
    localStringBuilder.append(" isDomesticUser INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "cre_type";
    locala.xDd.put("cre_type", "INTEGER");
    localStringBuilder.append(" cre_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "main_card_bind_serialno";
    locala.xDd.put("main_card_bind_serialno", "TEXT");
    localStringBuilder.append(" main_card_bind_serialno TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "ftf_pay_url";
    locala.xDd.put("ftf_pay_url", "TEXT");
    localStringBuilder.append(" ftf_pay_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "switchConfig";
    locala.xDd.put("switchConfig", "INTEGER");
    localStringBuilder.append(" switchConfig INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "reset_passwd_flag";
    locala.xDd.put("reset_passwd_flag", "TEXT");
    localStringBuilder.append(" reset_passwd_flag TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "find_passwd_url";
    locala.xDd.put("find_passwd_url", "TEXT");
    localStringBuilder.append(" find_passwd_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "is_open_touch";
    locala.xDd.put("is_open_touch", "INTEGER");
    localStringBuilder.append(" is_open_touch INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "lct_wording";
    locala.xDd.put("lct_wording", "TEXT");
    localStringBuilder.append(" lct_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "lct_url";
    locala.xDd.put("lct_url", "TEXT");
    localStringBuilder.append(" lct_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "cre_name";
    locala.xDd.put("cre_name", "TEXT");
    localStringBuilder.append(" cre_name TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "lqt_state";
    locala.xDd.put("lqt_state", "INTEGER");
    localStringBuilder.append(" lqt_state INTEGER");
    localStringBuilder.append(", ");
    locala.columns[16] = "paymenu_use_new";
    locala.xDd.put("paymenu_use_new", "INTEGER");
    localStringBuilder.append(" paymenu_use_new INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "is_show_lqb";
    locala.xDd.put("is_show_lqb", "INTEGER");
    localStringBuilder.append(" is_show_lqb INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "is_open_lqb";
    locala.xDd.put("is_open_lqb", "INTEGER");
    localStringBuilder.append(" is_open_lqb INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "lqb_open_url";
    locala.xDd.put("lqb_open_url", "TEXT");
    localStringBuilder.append(" lqb_open_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "lqt_cell_is_show";
    locala.xDd.put("lqt_cell_is_show", "INTEGER");
    localStringBuilder.append(" lqt_cell_is_show INTEGER");
    localStringBuilder.append(", ");
    locala.columns[21] = "lqt_cell_icon";
    locala.xDd.put("lqt_cell_icon", "TEXT");
    localStringBuilder.append(" lqt_cell_icon TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "lqt_cell_is_open_lqt";
    locala.xDd.put("lqt_cell_is_open_lqt", "INTEGER");
    localStringBuilder.append(" lqt_cell_is_open_lqt INTEGER");
    localStringBuilder.append(", ");
    locala.columns[23] = "lqt_cell_lqt_open_url";
    locala.xDd.put("lqt_cell_lqt_open_url", "TEXT");
    localStringBuilder.append(" lqt_cell_lqt_open_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "lqt_cell_lqt_title";
    locala.xDd.put("lqt_cell_lqt_title", "TEXT");
    localStringBuilder.append(" lqt_cell_lqt_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "lqt_cell_lqt_wording";
    locala.xDd.put("lqt_cell_lqt_wording", "TEXT");
    localStringBuilder.append(" lqt_cell_lqt_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[26] = "forget_passwd_url";
    locala.xDd.put("forget_passwd_url", "TEXT");
    localStringBuilder.append(" forget_passwd_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "unipay_order_state";
    locala.xDd.put("unipay_order_state", "INTEGER");
    localStringBuilder.append(" unipay_order_state INTEGER");
    localStringBuilder.append(", ");
    locala.columns[28] = "bank_priority";
    locala.xDd.put("bank_priority", "TEXT");
    localStringBuilder.append(" bank_priority TEXT");
    localStringBuilder.append(", ");
    locala.columns[29] = "wallet_balance";
    locala.xDd.put("wallet_balance", "LONG");
    localStringBuilder.append(" wallet_balance LONG");
    localStringBuilder.append(", ");
    locala.columns[30] = "wallet_entrance_balance_switch_state";
    locala.xDd.put("wallet_entrance_balance_switch_state", "INTEGER");
    localStringBuilder.append(" wallet_entrance_balance_switch_state INTEGER");
    localStringBuilder.append(", ");
    locala.columns[31] = "soter_pay_open_type";
    locala.xDd.put("soter_pay_open_type", "INTEGER");
    localStringBuilder.append(" soter_pay_open_type INTEGER");
    locala.columns[32] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46962);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean cQg()
  {
    boolean bool = true;
    if (this.field_is_reg == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean cQh()
  {
    if (this.field_is_reg == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cQi()
  {
    if (this.field_is_reg == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cQj()
  {
    if (this.field_is_reg == -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cQk()
  {
    boolean bool = true;
    if (this.field_is_open_touch == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.aj
 * JD-Core Version:    0.6.2
 */