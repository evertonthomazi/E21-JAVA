<?php

namespace BraspagSdk\Contracts\Pagador;

class FraudAnalysisCartData
{
    public $IsGift;

    public $ReturnsAccepted;

    // List<FraudAnalysisItemData>
    public $Items;

    public function __construct()
    {
        $this->Items = new FraudAnalysisItemData();
    }
}