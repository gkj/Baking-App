package com.gilangkusumajati.bakingapp.database;

import net.simonvt.schematic.annotation.AutoIncrement;
import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.PrimaryKey;

/**
 * Created by Gilang Kusuma Jati on 8/29/17.
 */

public interface RecipeColumns {
    @DataType(DataType.Type.INTEGER)
    @PrimaryKey
    @AutoIncrement
    String ID = "_id";

    @DataType(DataType.Type.INTEGER)
    String RECIPE_ID = "recipeId";

    @DataType(DataType.Type.TEXT)
    String NAME = "name";

    @DataType(DataType.Type.INTEGER)
    String SERVINGS = "servings";

    @DataType(DataType.Type.TEXT)
    String IMAGE = "image";
}
